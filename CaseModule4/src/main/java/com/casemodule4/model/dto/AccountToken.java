package com.casemodule4.model.dto;

import com.casemodule4.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AccountToken {
    private String username;
    private String avatar;
    private String token;

    private List<Role> roles;
}
