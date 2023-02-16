package com.casemodule4.repository;

import com.casemodule4.model.Cart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ICartRepo extends PagingAndSortingRepository<Cart,Integer> {
    @Query("SELECT c from Cart c where c.username=:username")
    List<Cart> findCartByUsername(String username);

    @Query("SELECT sum(c.price) from Cart c where c.username=:username")
    Double sum(String username);
}
