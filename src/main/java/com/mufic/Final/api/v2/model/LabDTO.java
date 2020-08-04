package com.mufic.Final.api.v2.model;

import lombok.Data;

@Data
public class LabDTO{

    private int id;

    private int courseInTerm;

    private String labDay;

    private int labTime;

    private int teachingStaff;

    private int studentCnt;

    private int maxStudent;

}
