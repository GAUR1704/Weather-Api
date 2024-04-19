package com.prowings.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.weatherapi.responce.model.WeatherData;
import com.prowings.weatherapi.service.WeatherApiService;

@RestController
public class WeatherApiConsumerController {

	@Autowired
	WeatherApiService weatherService;


	@GetMapping("/weathers/{city}")
	public ResponseEntity<String> getCurrentWeather(@PathVariable String city) {

		WeatherData data = weatherService.getCurrentWeatherData(city);

		String weatherDescription = data.getWeather().get(0).getDescription();
		double weatherTempinCelcius = kelvinToCelcius(data.getMain().getTemp());

		return new ResponseEntity<String>("Current weather status of " +city+" city is "+weatherDescription + " and Temperature is :" + weatherTempinCelcius + "°C", HttpStatus.OK);

	}

	private double kelvinToCelcius(double tempInKelvin) {

		return tempInKelvin - 273.15;
	}

}
