package com.prowings.weatherapi.exception;

public class WeatherServiceException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7347813072968997252L;

	public WeatherServiceException(String message) {
        super(message);
    }

    public WeatherServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
