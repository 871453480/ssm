package com.summer.entity;

import lombok.Data;


@Data
public class User {
    private long id;
    private String name;
    private String password;
    private double score;
//    private Date birthday;
}
