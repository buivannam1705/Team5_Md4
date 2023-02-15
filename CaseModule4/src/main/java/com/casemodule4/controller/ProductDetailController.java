package com.casemodule4.controller;

import com.casemodule4.model.ProductDetail;
import com.casemodule4.repository.IProductDetailRepo;
import com.casemodule4.service.Imp.ProductDetailServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productDetail")
public class ProductDetailController {
    @Autowired
    ProductDetailServiceImp productDetailServiceImp;
    @Autowired
    private IProductDetailRepo iProductDetailRepo;

    @GetMapping
    public List<ProductDetail> list(){
        return productDetailServiceImp.getAll();
    }

    @PostMapping
    public ProductDetail save(@RequestBody ProductDetail productDetail){
        return iProductDetailRepo.save(productDetail);
    }

    @GetMapping("/{id}")
    public ProductDetail showEdit(@PathVariable int id){
        return productDetailServiceImp.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id ){
        productDetailServiceImp.delete(id);
    }
}
