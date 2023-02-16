package com.casemodule4.controller;

import com.casemodule4.model.Account;
import com.casemodule4.model.Bill;
import com.casemodule4.service.Imp.AccountService;
import com.casemodule4.service.Imp.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/bill")
@CrossOrigin("*")
public class BillController {
    @Autowired
    BillService billService;
    @Autowired
    AccountService accountService;

    @GetMapping("/showDoneBill/{username}")
    public List<Bill> listBillByUser(@PathVariable String username){
        return billService.findByUsernameAndStatus(username,2);
    }

    @PostMapping("/save/{username}")
    public Bill save(@PathVariable String username,Bill bill){
        Account account = accountService.findAccountByUsername(username);
        bill.setDate(Date.valueOf(LocalDate.now()));
        bill.setId(0);
        bill.setStatus(1);
        bill.setAccount(account);
        billService.save(bill);
        return bill;
    }

    @PostMapping("changeStatus/{username}")
    public void change(@PathVariable String username){
        Account account =accountService.findAccountByUsername(username);
        Bill bill= billService.findByAccount_IdAndStatus(account.getId(),1);
        bill.setStatus(2);
        billService.save(bill);
    }

    @PostMapping("/deleteBillStatus")
    public void deleteAfterAll(){
        billService.deleteByStatus(1);
    }
}
