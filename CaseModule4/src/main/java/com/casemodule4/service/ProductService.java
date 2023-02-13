package com.casemodule4.service;

import com.casemodule4.model.Product;
import com.casemodule4.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
    public Page<Product> getAll(Pageable pageable){
        return productRepo.findAll(pageable);
    }
}
