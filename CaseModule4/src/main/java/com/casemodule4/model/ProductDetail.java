package com.casemodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int status;
    private long quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Size size;
}
