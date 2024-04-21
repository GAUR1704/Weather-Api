package com.prowings.weatherapi.response.dto.model;

import java.util.ArrayList;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WeatherDataDTO {
	public Coordinates coordinates;
	public ArrayList<Weather> weather;
	public Main main;
	public int visibility;
	public Wind wind;
	public Rain rain;
	public Clouds clouds;
	public int dt;
	public Sys sys;
	public int id;
	public String name;
}