package com.casemodule4.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;



import java.util.List;


@Data
@AllArgsConstructor
public class AccountToken {
    private String username;
    private String avatar;
    private String token;

    private String role;
}
