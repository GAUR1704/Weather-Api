package com.prowings.weatherapi.response.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Coord {
	private double lon;
	private double lat;
}