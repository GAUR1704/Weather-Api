package com.prowings.weatherapi.service;

import com.prowings.weatherapi.responce.model.WeatherData;

public interface WeatherApiService {
	
	public WeatherData getCurrentWeatherData(String city);

}
