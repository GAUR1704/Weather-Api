package com.prowings.weatherapi.service;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.prowings.weatherapi.response.dto.model.WeatherDataDTO;

public interface WeatherApiService {
	
	public ResponseEntity<WeatherDataDTO> getCurrentWeatherData(String city) throws JsonProcessingException;

}
