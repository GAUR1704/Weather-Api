package com.prowings.weatherapi.response.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sys {

    private int type;
    private int id;
    private String country;
    private int sunrise;
    private int sunset;
}