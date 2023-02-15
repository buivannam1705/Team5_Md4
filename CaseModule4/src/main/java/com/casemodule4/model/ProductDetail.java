package com.casemodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "int default 1")
    private int status;
    private Long quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Size size;

}
