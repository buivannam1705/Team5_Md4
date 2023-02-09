package com.casemodule4.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String address;
    private String avatar;
    @NotNull
    private String phoneNumber;
    @Column(columnDefinition ="integer default 2")
    private int role;
    @Column(columnDefinition = "integer default 2")
    private int status;

}
