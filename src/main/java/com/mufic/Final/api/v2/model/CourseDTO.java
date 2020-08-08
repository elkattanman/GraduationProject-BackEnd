package com.mufic.Final.api.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CourseDTO {

    String code;

    private String nameEnglish;

    private String nameArabic;

    private int hours;

    private int lecHours;

    private int LabHours;

    private String description;

    int program;

    String preCourse;

    @JsonProperty("course_url")
    private String courseUrl;

}
