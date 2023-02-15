package com.casemodule4.repository;

import com.casemodule4.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepo extends PagingAndSortingRepository<Product,Long> {
}
