package com.casemodule4.repository;

import com.casemodule4.model.ProductDetail;
import com.casemodule4.model.Size;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IProductDetailRepo extends PagingAndSortingRepository<ProductDetail,Integer> {
//    @Query(nativeQuery = true,value = "SELECT * from product_detail  where product_id =: product_id")
//    List<ProductDetail> findProductDetailByProduct_Id(int product_id);
    public List<ProductDetail> findProductDetailByProduct_Id(int product_id);
    @Query("select p.size from ProductDetail p where p.product=: product_id")
    List<Size> getSize(int product_id);
}
