package com.prowings.weatherapi.exception;

public class CityNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3942125210705316939L;

	public CityNotFoundException() {
		super();
	}

	public CityNotFoundException(String message) {
		super(message);
	}
	
	

}
