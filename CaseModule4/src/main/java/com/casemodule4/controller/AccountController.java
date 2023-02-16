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

@CrossOrigin("*")
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }


    @GetMapping("/{username}")
    public Account name(@PathVariable String username) {
        return accountService.findAccountByUsername(username);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Account account) {
        if (accountService.findAccountByUsername(account.getUsername()) == null) {
            accountService.save(account);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile fileImg) {
        String nameImg = fileImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(fileImg.getBytes(), new File("D:\\Modul4\\Case4\\FE2\\Team5_FrontEnd\\MarkUps-dailyShop\\dailyShop\\img/" + nameImg));
            return "/img/" + nameImg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/{id}")
    public Account showEdit(@PathVariable int id) {
        return accountService.findById(id);
    }

    @PutMapping("/{id}")
    public Account edit(@RequestBody Account account) {
        return accountService.save(account);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {

        accountService.delete(id);
    }


    @PostMapping("/block/{id}")
    public void Block(@PathVariable int id) {
        accountService.setStatus(id);
    }

    @GetMapping("/search/{username}")
    public List<Account> search(@PathVariable String username) {
       return accountService.findbyusername(username);

    }





}
