package com.mufic.Final.api.v2.model;


import lombok.Data;

import java.util.Date;

@Data
public class StudentDTO {

    private String id;

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




}
