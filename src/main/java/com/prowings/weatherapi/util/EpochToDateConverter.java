package com.prowings.weatherapi.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.dozer.CustomConverter;

public class EpochToDateConverter implements CustomConverter{

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		
		
		if (sourceFieldValue == null)
			return null;
		if (sourceFieldValue instanceof Integer) {
			int source = (Integer) sourceFieldValue;
			return epochToString(source);
		}

		return "Invalid Date";
	}

	public static String epochToString(long epochTime) {
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(epochTime), ZoneId.systemDefault());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dateString = dateTime.format(formatter);
		return dateString;
	}
	
	

}
