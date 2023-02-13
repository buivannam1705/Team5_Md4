package com.casemodule4.service.Imp;

import com.casemodule4.model.Product;
import com.casemodule4.repository.IProductRepo;
import com.casemodule4.service.interf.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements IProductService<Product> {
    @Autowired
    IProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Page getAll(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void remove(Integer id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product findById(Integer id) {
        return productRepo.findById(id).get();
    }
}
