package com.casemodule4.service;

import com.casemodule4.model.ProductDetail;
import com.casemodule4.repository.IProductDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailService {
    @Autowired
    IProductDetailRepo productDetailRepo;

    public List<ProductDetail> getAllProductsDetail() {
        return (List<ProductDetail>) productDetailRepo.findAll();
    }
    public ProductDetail saveProductDetail(ProductDetail productDetail){
        return productDetailRepo.save(productDetail);
    }
    public ProductDetail findProductDetailById(int id){
        return productDetailRepo.findById(id).get();
    }
    public ProductDetail deleteProductDetailById(int id){
        ProductDetail productDetail=findProductDetailById(id);
        productDetailRepo.deleteById(id);
        return productDetail;
    }
}
