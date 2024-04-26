package com.prowings.weatherapi.exception;

public class InvalidUrlException extends RuntimeException{

	
	private static final long serialVersionUID = 2609178529088345926L;

	public InvalidUrlException() {
		super();
	}

	public InvalidUrlException(String message) {
		super(message);
	}
	
	

}
