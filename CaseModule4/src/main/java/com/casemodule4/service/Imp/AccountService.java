package com.casemodule4.service.Imp;


import com.casemodule4.model.Account;
import com.casemodule4.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findAccountByUsername(username);
        return new User(account.getUsername(),account.getPassword(),account.getRoles());
    }

    public Account findAccountByUsername(String username){
        return iAccountRepo.findAccountByUsername(username);
    }

}
