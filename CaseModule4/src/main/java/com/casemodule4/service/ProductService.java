package com.casemodule4.service;

import com.casemodule4.model.Product;
import com.casemodule4.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepo.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    public Product findProductById(long id) {
        return productRepo.findById(id).get();
    }

    public Product deleteProductById(long id) {
        Product product = findProductById(id);
        productRepo.deleteById(id);
        return product;
    }
}
