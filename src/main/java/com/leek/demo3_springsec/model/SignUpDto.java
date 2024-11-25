package com.leek.demo3_springsec.model;

import lombok.Data;

@Data
public class SignUpDto {
    private String username;
    private String email;
    private String name;
    private String password;
    private boolean enabled;
}
