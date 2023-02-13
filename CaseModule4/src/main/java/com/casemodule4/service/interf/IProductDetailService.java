package com.casemodule4.service.interf;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductDetailService<ProductDetail> {
    Page<ProductDetail> getAllPage(Pageable pageable);

    List<ProductDetail> getAll();

    ProductDetail save(ProductDetail productDetail);

    void delete(int id);

    ProductDetail findById(int id);
}
