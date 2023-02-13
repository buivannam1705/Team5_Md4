package com.casemodule4.controller;

import com.casemodule4.model.ProductDetail;
import com.casemodule4.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class ProductDetailController {
    @Autowired
    ProductDetailService productDetailService;
    @GetMapping("/products")
    public ResponseEntity<Page<ProductDetail>> getAll(){
        return new ResponseEntity<>(productDetailService.getAll(PageRequest.of(0,10)), HttpStatus.OK);
    }
}
