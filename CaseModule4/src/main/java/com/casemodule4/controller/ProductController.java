package com.casemodule4.controller;

import com.casemodule4.model.Product;
import com.casemodule4.service.Imp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    ProductServiceImp productServiceImp;

    @GetMapping
    public List<Product> getAll(){
        return productServiceImp.findAll();
    }

    @GetMapping("/{id}")
    public Product showEdit(@PathVariable int id){
        return productServiceImp.findById(id);
    }

    @PostMapping()
    public void save(@RequestBody Product product){
        productServiceImp.save(product);
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile fileImg) {
        String nameImg = fileImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(fileImg.getBytes(), new File("C:\\caseM4\\Team5_Md4\\M4_FE\\img" + nameImg));
            return "/img/" + nameImg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productServiceImp.remove(id);
    }
}
