package com.prowings.weatherapi.responce.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rain {
    @JsonProperty("1h") 
    private double _1h;
}