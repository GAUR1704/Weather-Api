package com.prowings.weatherapi.response.dto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sys {
	public String sunrise;
	public String sunset;
}