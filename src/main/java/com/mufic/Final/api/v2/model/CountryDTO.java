package com.mufic.Final.api.v2.model;

import lombok.Data;

import java.util.List;

@Data
public class CountryDTO {

    private int id;

    private String name;

    private String iso3;

    private String iso2;

    private String phoneCode;

    private String capital;

    private String currency;

    private String nativ;

    private String emoji;

    private String emojiU;

    private boolean flag;

    private String wikiDataId;

    private List<String> cities;

    private List<String> states;

}
