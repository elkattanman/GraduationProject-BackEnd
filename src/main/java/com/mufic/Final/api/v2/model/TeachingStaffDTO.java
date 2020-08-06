package com.mufic.Final.api.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TeachingStaffDTO{

    private Long id;

    private String nameEnglish;

    private String nameArabic;

    private byte[] img;

    String nationality;

    String gender;

    String religion;

    String DOB;

    String nationalId;

    String email;

    String phdDegree;

    Long user;

    int city;

    @JsonProperty("teachingstaff_url")
    private String teachingStaffUrl;

}
