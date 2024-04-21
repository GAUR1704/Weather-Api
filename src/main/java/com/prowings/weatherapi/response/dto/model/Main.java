package com.prowings.weatherapi.response.dto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Main{
    public float tempruture;
    public float feels_like;
    public float temp_min;
    public float temp_max;
    public int humidity;
}