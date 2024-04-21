package com.prowings.weatherapi.response.dto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Weather {
	public int id;
	public String main;
	public String description;
	public String icon;
}