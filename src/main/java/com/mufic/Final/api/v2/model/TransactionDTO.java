package com.mufic.Final.api.v2.model;

import lombok.Data;

import java.util.Date;

@Data
public class TransactionDTO{

    private int id;

    private int student;

    private int term;

    private int courseCnt;

    private double total;

    private int billNo;

    private Date createTime;

}
