package com.mufic.Final.api.v2.model;


import lombok.Data;

import java.util.List;

@Data
public class ProgramDTO {

    private int id;

    private String nameEnglish;

    private String nameArabic;

    private int hours;

    int underRequirement;

    List<String> courses;
}
