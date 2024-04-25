package com.prowings.weatherapi.service;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prowings.weatherapi.exception.CityNotFoundException;
import com.prowings.weatherapi.exception.WeatherServiceException;
import com.prowings.weatherapi.response.dto.model.WeatherDataDTO;
import com.prowings.weatherapi.response.model.WeatherData;
import com.prowings.weatherapi.util.CityLatLong;

@Service
public class WeatherApiServiceImpl implements WeatherApiService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DozerBeanMapper mapper;

    @Value("${base_url}")
    String baseUrl;

    @Value("${apiKey}")
    String apiKey;

    ObjectMapper objMapper = new ObjectMapper();

    @Override
    public ResponseEntity<WeatherDataDTO> getCurrentWeatherData(String city) throws JsonProcessingException {
        try {
            List<Double> latLong = CityLatLong.getLatLongCode().get(city);
            if (latLong == null || latLong.size() < 2) {
                throw new CityNotFoundException("City '" + city + "' not found");
            }

            double lat = latLong.get(0);
            double lon = latLong.get(1);

            String dynamicUrl = baseUrl + "?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey;

            System.out.println(">>>>API Url : " + dynamicUrl);

            ResponseEntity<WeatherData> fetchedWeatherData = restTemplate.getForEntity(dynamicUrl, WeatherData.class);

            WeatherData data = fetchedWeatherData.getBody();

            String responseFromWeatherApi = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(fetchedWeatherData);

            System.out.println(responseFromWeatherApi);

            WeatherDataDTO dto = mapper.map(fetchedWeatherData.getBody(), WeatherDataDTO.class);

            String jsonStr = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);

            System.out.println(">>>>>After DozerBean Mapper mapping :");

            System.out.println(jsonStr);

            System.out.println("<<<<<");

            return new ResponseEntity<>(dto, HttpStatus.OK);
            
        } catch (CityNotFoundException ex) {
        	
            throw ex;
            
        } catch (Exception ex) {
        	
            throw new WeatherServiceException("Error fetching weather data for city: " + city, ex);
        }
    }
}