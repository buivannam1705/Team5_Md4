package com.casemodule4.service.Imp;

import com.casemodule4.model.Account;
import com.casemodule4.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    IAccountRepo accountRepo;

    public List<Account> getAll() {
        return (List<Account>) accountRepo.findAll();
    }

    public Account findAccountByUsername(String username){
        return accountRepo.findAccountByUsername(username);
    }

    public Account save(Account account){
        return  accountRepo.save(account);
    }

    public Account findById(int id){
        return accountRepo.findById(id).get();
    }

    public void delete(int id){
        accountRepo.deleteById(id);
    }


}
