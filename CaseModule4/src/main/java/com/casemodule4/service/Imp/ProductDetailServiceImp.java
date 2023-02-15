package com.casemodule4.service.Imp;

import com.casemodule4.model.ProductDetail;
import com.casemodule4.model.Size;
import com.casemodule4.repository.IProductDetailRepo;
import com.casemodule4.service.interf.IProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductDetailServiceImp implements IProductDetailService<ProductDetail> {
    @Autowired
    IProductDetailRepo productDetailRepo;

    @Override
    public Page<ProductDetail> getAllPage(Pageable pageable) {
        return productDetailRepo.findAll(pageable);
    }

    @Override
    public List<ProductDetail> getAll() {
        return (List<ProductDetail>) productDetailRepo.findAll();
    }

    @Override
    public ProductDetail save(ProductDetail productDetail) {
        return productDetailRepo.save(productDetail);
    }

    @Override
    public void delete(int id) {
        productDetailRepo.deleteById(id);
    }

    @Override
    public ProductDetail findById(int id) {
        return productDetailRepo.findById(id).get();
    }

    public List<ProductDetail> findProductDetailByProduct_id(int id){
        return productDetailRepo.findProductDetailByProduct_Id(id);
    }

    public List<Size> getSize(int id){
        return productDetailRepo.getSize(id);
    }
}
