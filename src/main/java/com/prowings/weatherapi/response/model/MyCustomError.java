package com.prowings.weatherapi.response.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyCustomError {
	
	private String massage;
	private String rootCause;
	private int status;
	

}
