package com.prowings.weatherapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.prowings.weatherapi.response.model.MyCustomError;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(WeatherServiceException.class)
    public ResponseEntity<String> handleWeatherServiceException(WeatherServiceException ex) {
        
    	System.out.println("Inside handleWeatherServiceException handler method");

        MyCustomError error = new MyCustomError();

		error.setMassage(ex.getMessage());
		error.setRootCause("abc");
		error.setStatus(500);
		
		 return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR); 
    }
    
    @ExceptionHandler(CityNotFoundException.class)
    public ResponseEntity<String> handleCityNotFoundException(CityNotFoundException ex){
    	
    	System.out.println("Inside handleCityNotFoundException() handler method");

        MyCustomError error = new MyCustomError();

		error.setMassage(ex.getMessage());
		error.setRootCause("Entered city is not available in our application");
		error.setStatus(402);
		
		return new ResponseEntity(error, HttpStatus.NOT_FOUND);  
    	
    }

}