package com.xanthuim.api;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
