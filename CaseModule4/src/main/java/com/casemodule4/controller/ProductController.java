package com.casemodule4.controller;

import com.casemodule4.model.Product;
import com.casemodule4.service.Imp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
@RestController
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductServiceImp productServiceImp;

    @GetMapping
    public List<Product> getAll(){
        return productServiceImp.findAll();
    }

    @GetMapping("/{id}")
    public Product showEdit(@PathVariable int id){
        return productServiceImp.findById(id);
    }

    @PostMapping()
    public void save(@RequestBody Product product){
        productServiceImp.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productServiceImp.remove(id);
    }
}
