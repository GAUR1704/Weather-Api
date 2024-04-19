package com.prowings.weatherapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowings.weatherapi.responce.model.WeatherData;
import com.prowings.weatherapi.util.CityLatLong;

@Service
public class WeatherApiServiceImpl implements WeatherApiService {

	@Autowired
	RestTemplate restTemplate;

	double lat;
	double lon;

	@Value("${base_url}")
	String baseUrl;

	@Value("${apiKey}")
	String apiKey;

	@Override
	public WeatherData getCurrentWeatherData(String city) {

		calculateLatLong(city);

//		https://api.openweathermap.org/data/2.5/weather?lat=18.6298&lon=73.7997&appid=aea2c2eaeb4020c7d96e8c22ce8d0bb2

		String dynamicUrl = baseUrl + "?lat=" + lat + "&" + "lon=" + lon + "&appid=" + apiKey;
		
		System.out.println(">>>>API Url : " + dynamicUrl);

		ResponseEntity<WeatherData> featchWeatherData = restTemplate.getForEntity(dynamicUrl, WeatherData.class);

		WeatherData data = featchWeatherData.getBody();

		return data;
	}

	private void calculateLatLong(String city) {

		lat = CityLatLong.getLatLongCode().get(city).get(0);
		lon = CityLatLong.getLatLongCode().get(city).get(1);

	}

}
