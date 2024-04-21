package com.prowings.weatherapi.exception;

public class CityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5109808043401699443L;

	public CityNotFoundException() {
		super();
	}

	public CityNotFoundException(String message) {
		super(message);
	}

}
