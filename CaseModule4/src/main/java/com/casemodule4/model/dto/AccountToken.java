package com.casemodule4.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountToken {
    private int id;

    private  int status;
    private String username;
    private String avatar;
    private String token;
    private String role;
}
