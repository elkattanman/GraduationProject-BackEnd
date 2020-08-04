package com.mufic.Final.api.v2.model;


import lombok.Builder;
import lombok.Data;

@Data
public class CityDTO{

    private int id;

    private String name;

    private int state;

    private String stateCode;

    private int country;

    private String countryCode;

    private double latitude;

    private double longitude;

    private boolean flag;

    private String wikiDataId;

}
