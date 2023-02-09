package com.casemodule4.repository;

import com.casemodule4.model.ProductDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductDetailRepo extends PagingAndSortingRepository<ProductDetail,Integer> {
}
