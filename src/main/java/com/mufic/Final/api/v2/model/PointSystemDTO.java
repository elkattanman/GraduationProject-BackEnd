package com.mufic.Final.api.v2.model;

import lombok.Data;

@Data
public class PointSystemDTO {

    private int id;

    private String nameEnglish;

    private String nameArabic;

    private int degreeLow;

    private int degreeHigh;

    private double points;
}
