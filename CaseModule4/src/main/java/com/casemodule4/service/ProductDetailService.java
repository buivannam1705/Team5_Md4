package com.casemodule4.service;

import com.casemodule4.model.Product;
import com.casemodule4.model.ProductDetail;
import com.casemodule4.repository.IProductDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailService {
    @Autowired
    IProductDetailRepo productDetailRepo;
    public Page<ProductDetail> getAll(Pageable pageable) {
        return productDetailRepo.findAll(pageable);
    }
}
