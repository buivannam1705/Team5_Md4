//package com.casemodule4.repository;
//
//import com.casemodule4.model.Account;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface IAccountRepo2 extends PagingAndSortingRepository<Account, Integer> {
//    @Query(nativeQuery = true, value = "SELECT * from Account where username like concat('%',:username,'%');")
//    List<Account> findAccountByUsername1(@Param("username ") String username);
//}
