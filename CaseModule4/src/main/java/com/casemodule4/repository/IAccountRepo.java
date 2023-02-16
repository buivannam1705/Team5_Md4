package com.casemodule4.repository;


import com.casemodule4.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAccountRepo extends PagingAndSortingRepository<Account, Integer> {
    Account findAccountByUsername(String username);

    @Query(nativeQuery = true, value =
            "select * from account where username=:username")
    Account checkUser(@Param("username") String username);


    @Query(nativeQuery = true, value = "SELECT * from Account where username like concat('%',:username,'%');")
    List<Account>  findAccountByUsername1(@Param("username") String username);

}
