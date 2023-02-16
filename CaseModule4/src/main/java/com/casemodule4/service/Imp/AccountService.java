package com.casemodule4.service.Imp;


import com.casemodule4.model.Account;
import com.casemodule4.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService implements UserDetailsService {
    @Autowired
    IAccountRepo iAccountRepo;

    public  Account checkUser(String username){
        return iAccountRepo.checkUser(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findAccountByUsername(username);
        GrantedAuthority grantedAuthority = new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return account.getRole();
            }
        };

        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(grantedAuthority);
        return new User(account.getUsername(),account.getPassword(),authorityList);
    }

    public Account findAccountByUsername(String username){
        return iAccountRepo.findAccountByUsername(username);
    }

    public Page<Account> getPage(Pageable pageable) {
        return iAccountRepo.findAll(pageable);
    }
    public List<Account> getAll() {
        return (List<Account>) iAccountRepo.findAll();
    }

    public Account save(Account account) {
        return iAccountRepo.save(account);
    }

    public Account delete(int id) {
        Account account = findById(id);
        iAccountRepo.deleteById(id);
        return account;
    }

    public Account findById(int id) {
        return iAccountRepo.findById(id).get();
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
