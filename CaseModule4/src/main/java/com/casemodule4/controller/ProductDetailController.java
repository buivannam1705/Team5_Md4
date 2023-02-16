package com.casemodule4.controller;

import com.casemodule4.model.ProductDetail;
import com.casemodule4.model.Size;
import com.casemodule4.repository.IProductDetailRepo;
import com.casemodule4.service.Imp.ProductDetailServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productDetail")
@CrossOrigin("*")
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

    @GetMapping("SingleProduct/{id}")
    public List<ProductDetail> singleProductList(@PathVariable int id){
        return productDetailServiceImp.findProductDetailByProduct_id(id);
    }

    @GetMapping("size/{id}")
    public List<Size> listSize(@PathVariable int id){
        return productDetailServiceImp.getSize(id);
    }

    @GetMapping("/{id}")
    public ProductDetail showEdit(@PathVariable int id){
        return productDetailServiceImp.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id ){
        productDetailServiceImp.delete(id);
    }

    @GetMapping("findById/{id}")
    public ProductDetail productDetail(@PathVariable int id){
        return productDetailServiceImp.findById(id);
    }
}
