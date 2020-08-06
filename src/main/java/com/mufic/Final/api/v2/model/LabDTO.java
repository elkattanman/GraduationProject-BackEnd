package com.mufic.Final.api.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LabDTO{

    private Long id;

    private int courseInTerm;

    private String labDay;

    private int labTime;

    private int teachingStaff;

    private int studentCnt;

    private int maxStudent;

    @JsonProperty("lab_url")
    private String labUrl;

}
