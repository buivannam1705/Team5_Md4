package com.casemodule4.service.Imp;

import com.casemodule4.model.Cart;
import com.casemodule4.repository.ICartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService {
    @Autowired
    ICartRepo cartRepo;

    public List<Cart> getAllByUsername(String username){
        return cartRepo.findCartByUsername(username);
    }

    public Cart save(Cart cart){
        return cartRepo.save(cart);
    }

    public Cart findById(int id) {
        return cartRepo.findById(id).get();
    }

    public void delete(int id){
        cartRepo.deleteById(id);
    }

    public void sum(String username){
        cartRepo.sum(username);
    }
}
