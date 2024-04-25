package com.prowings.weatherapi.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityLatLong {
	
	public static Map<String, List<Double>> getLatLongCode(){
		
		
		HashMap<String, List<Double>> latLongCity = new HashMap<>();
		
		latLongCity.put("Pimpri", Arrays.asList(18.6298,73.7997));
		latLongCity.put("Pune", Arrays.asList(18.5204,73.8567));
		latLongCity.put("Kolhapur", Arrays.asList(16.7050,74.2433));
		latLongCity.put("Nagpur", Arrays.asList(21.1458,79.0882));
		
		return Collections.unmodifiableMap(latLongCity);
	}
	

}
