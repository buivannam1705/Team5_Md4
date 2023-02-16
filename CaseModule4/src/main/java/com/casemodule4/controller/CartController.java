package com.casemodule4.controller;

import com.casemodule4.model.Cart;
import com.casemodule4.model.ProductDetail;
import com.casemodule4.service.Imp.CartService;
import com.casemodule4.service.Imp.ProductDetailServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")
public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    ProductDetailServiceImp productDetailServiceImp;

    @GetMapping("/listByAccount/{username}")
    public List<Cart> listCartByUser(@PathVariable String username){
        return cartService.getAllByUsername(username);
    }
    @PostMapping("{id}&{username}")
    public Cart save(@PathVariable int id,@PathVariable String username){
        ProductDetail productDetail = productDetailServiceImp.findById(id);

        Cart cart = new Cart(0,username,productDetail.getProduct().getName(),productDetail.getId(),productDetail.getQuantity(),productDetail.getSize().getName(),productDetail.getProduct().getImg(),productDetail.getProduct().getPrice());
        return cartService.save(cart);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        cartService.delete(id);
    }

    @GetMapping("/sum/{username}")
    public void sum(@PathVariable String username){
        cartService.sum(username);
    }





}
