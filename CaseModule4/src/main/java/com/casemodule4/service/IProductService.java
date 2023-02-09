package com.casemodule4.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService<Product> {
    List<Product> findAll();

    Page<Product> getAll(Pageable pageable);

    Product save(Product product);

    void remove(Integer id);

    Product findById(Integer id);

}
