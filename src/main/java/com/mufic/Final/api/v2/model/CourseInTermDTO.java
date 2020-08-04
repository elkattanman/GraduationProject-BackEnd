package com.mufic.Final.api.v2.model;


import lombok.Data;

@Data
public class CourseInTermDTO {


    private int id;
    private int term;

    private String course;

    private int instructor;

    private String lectureDay;

    private int lectureTime;

    private String courseType;

    private int studentCnt;

    private int minStudent;

}
