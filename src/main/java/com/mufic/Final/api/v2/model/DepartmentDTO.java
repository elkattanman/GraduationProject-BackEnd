package com.mufic.Final.api.v2.model;

import lombok.Data;

@Data
public class DepartmentDTO{

    private int id;

    private String nameEnglish;

    private String nameArabic;

    private String code;

    private int graduationProjectHours;

    private int graduationHours;

    private int minTerms;

    private int maxDegreeOnFail;

}
