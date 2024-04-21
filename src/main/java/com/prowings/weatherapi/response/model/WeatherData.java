package com.prowings.weatherapi.response.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WeatherData {
	private Coord coord;
	private ArrayList<Weather> weather;
	private String base;
	private Main main;
	private int visibility;
	private Wind wind;
	private Rain rain;
	private Clouds clouds;
	private int dt;
	private Sys sys;
	private int timezone;
	private int id;
	private String name;
	private int cod;

}