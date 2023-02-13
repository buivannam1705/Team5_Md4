package com.casemodule4.repository;


import com.casemodule4.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IAccountRepo extends PagingAndSortingRepository<Account, Integer> {
    Account findAccountByUsername(String username);
}
