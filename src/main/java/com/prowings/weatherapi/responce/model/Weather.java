package com.prowings.weatherapi.responce.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;
}
