package com.prowings.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.prowings.weatherapi.response.dto.model.WeatherDataDTO;
import com.prowings.weatherapi.response.model.WeatherData;
import com.prowings.weatherapi.service.WeatherApiService;

@RestController
public class WeatherApiConsumerController {

	@Autowired
	WeatherApiService weatherService;

//	@GetMapping("/weathers/{city}")
//	public ResponseEntity<String> getCurrentWeather(@PathVariable String city) {
//
//		WeatherData data = weatherService.getCurrentWeatherData(city);
//
//		String weatherDescription = data.getWeather().get(0).getDescription();
//		double weatherTempinCelcius = kelvinToCelcius(data.getMain().getTemp());
//
//		return new ResponseEntity<String>("Current weather status of " +city+" city is "+weatherDescription + " and Temperature is :" + weatherTempinCelcius + "°C", HttpStatus.OK);
//
//	}
//
//	private double kelvinToCelcius(double tempInKelvin) {
//
//		return tempInKelvin - 273.15;
//	}

	@GetMapping("/weathers/{city}")
	
	public ResponseEntity<WeatherDataDTO> getCurrentWeather(@PathVariable String city) throws JsonProcessingException
	{
		System.out.println("Request received to fetch Weather details of city : "+city);
		return weatherService.getCurrentWeatherData(city);
	}

}
