package com.casemodule4.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String address;
    private String avatar;
    private String phoneNumber;
    @ManyToMany
    private List<Role> role;
    private int status;

}
