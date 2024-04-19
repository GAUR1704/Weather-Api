package com.prowings.weatherapi.responce.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Wind {
    private double speed;
    private int deg;
    private double gust;

}