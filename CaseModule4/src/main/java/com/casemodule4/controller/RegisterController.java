package com.casemodule4.controller;

import com.casemodule4.model.Account;
import com.casemodule4.service.Imp.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    AccountService accountService;
    @GetMapping("/{username}")
    public ResponseEntity checkUser(@PathVariable String username){
      if(accountService.checkUser(username) != null){
          return new ResponseEntity(HttpStatus.NOT_FOUND);
      }

      return new ResponseEntity(HttpStatus.OK);
    }
}
