package com.mufic.Final.api.v2.model;

import lombok.Data;

import java.util.List;

@Data
public class StateDTO {

    private int id;

    String name;


    int country;

    String countryCode;

    String fipsCode;

    String iso2;

    boolean flag;

    String wikiDataId;

    List<String> cities;


}
