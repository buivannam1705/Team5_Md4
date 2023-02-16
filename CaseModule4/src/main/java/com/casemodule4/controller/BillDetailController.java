package com.casemodule4.controller;

import com.casemodule4.model.*;
import com.casemodule4.service.Imp.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("billDetail")
@CrossOrigin("*")
public class BillDetailController {
    @Autowired
    BillDetailService billDetailService;
    @Autowired
    CartService cartService;
    @Autowired
    BillService billService;
    @Autowired
    AccountService accountService;
    @Autowired
    ProductDetailServiceImp productDetailServiceImp;

    @PostMapping("/save/{id}&{username}")
    public BillDetail save(@PathVariable int id,@PathVariable String username,BillDetail billDetail){
        Cart cart = cartService.findById(id);
        Account account = accountService.findAccountByUsername(username);
        Bill bill = billService.findByAccount_IdAndStatus(account.getId(),1);
        ProductDetail productDetail= productDetailServiceImp.findById(cart.getProductDetail_id());
        billDetail.setProductDetail(productDetail);
        billDetail.setBill(bill);
        billDetail.setId(0);
        return billDetailService.save(billDetail);
    }

    @GetMapping("")

}
