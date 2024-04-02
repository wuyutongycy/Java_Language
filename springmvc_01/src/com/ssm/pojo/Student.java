package com.ssm.pojo;

import lombok.Data;

@Data
public class Student {
    private String sid;
    private String sname;
    private Classroom classroom;
}
