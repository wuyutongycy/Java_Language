package com.ssm.bean;

import lombok.Data;

@Data
public class Student {
    private Integer stId;
    private String stName;
    private  String sex;
    private Card card;
}
