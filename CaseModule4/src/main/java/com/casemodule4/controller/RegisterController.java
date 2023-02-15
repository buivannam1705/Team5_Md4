package com.casemodule4.controller;

import com.casemodule4.model.Account;
import com.casemodule4.service.Imp.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/register")
@CrossOrigin("*")

public class RegisterController {
    @Autowired
    AccountService accountService;

    @PostMapping
    public ResponseEntity<String> Create (@RequestBody Account account){
        if (accountService.findAccountByUsername(account.getUsername())==null){
            accountService.SaveAccount(account);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile fileImg) {
        String nameImg = fileImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(fileImg.getBytes(), new File("D:\\Modul4\\Case4\\FE\\MarkUps-dailyShop\\dailyShop\\img\\" + nameImg));
            return "/img/" + nameImg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @GetMapping
    public List<Account> getAll(){
       return accountService.GetAll();
    }

    @GetMapping("/{username}")
    public boolean checkUsername(@PathVariable String username){
       return accountService.checkUserNameAccount(username);
    }




}
