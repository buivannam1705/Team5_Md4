package com.casemodule4.service.Imp;

import com.casemodule4.model.Account;
import com.casemodule4.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
>>>>>>> 9d1ea54a26c96830a3a28a3f3e35b4bb42c547b2
import org.springframework.stereotype.Service;

import java.util.List;

<<<<<<< HEAD
@Service
public class AccountService {
=======
@Component
public class AccountService implements UserDetailsService {
>>>>>>> 9d1ea54a26c96830a3a28a3f3e35b4bb42c547b2
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

    public Account setStatus(int id){
        int status = 2;
        int status1 = 1;

        Account account= findById(id);
        if(account.getStatus()==2){
            account.setStatus(status1);
            iAccountRepo.save(account);
            return account;
        }else {
            account.setStatus(status);
            iAccountRepo.save(account);
            return account;
        }


    }

    public List<Account> findbyusername(String username){
       return iAccountRepo.findAccountByUsername1(username);
    }

}
