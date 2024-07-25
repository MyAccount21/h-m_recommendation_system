package com.hm.outfit_recommendation.model;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;
}
