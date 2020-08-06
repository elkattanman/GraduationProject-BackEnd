package com.mufic.Final.api.v2.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CourseInTermDTO {


    private Long id;
    private int term;

    private String course;

    private int instructor;

    private String lectureDay;

    private int lectureTime;

    private String courseType;

    private int studentCnt;

    private int minStudent;

    @JsonProperty("courseinterm_url")
    private String courseInTermUrl;

}
