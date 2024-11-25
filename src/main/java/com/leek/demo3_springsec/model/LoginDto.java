package com.leek.demo3_springsec.model;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameorEmail;
    private String password;
}
