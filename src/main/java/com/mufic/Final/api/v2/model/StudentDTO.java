package com.mufic.Final.api.v2.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class StudentDTO {

    private Long id;

    private String nameEnglish;

    private String nameArabic;

    private byte[] img;

    String nationality;

    String gender;

    String religion;

    Date DOB;

    String nationalId;

    String guardianName;

    String GuardianJob;

    String email;

    String secSchool;

    String preQualfication;

    Date QuilificationYear;

    double degrees;

    int guide;

    int user;

    int department;

    int city;

    int studentInfo;

    @JsonProperty("student_url")
    private String studentUrl;

}
