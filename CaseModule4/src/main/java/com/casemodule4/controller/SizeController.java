package com.casemodule4.controller;

import com.casemodule4.model.Size;
import com.casemodule4.service.Imp.SizeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/size")
@RestController
@CrossOrigin("*")
public class SizeController {
    @Autowired
    SizeServiceImp sizeServiceImp;

    @GetMapping
    public List<Size> all(){
        return sizeServiceImp.getAll();
    }

    @GetMapping("/{id}")
    public Size showEdit(@PathVariable int id){
        return sizeServiceImp.findById(id);
    }

    @PostMapping
    public Size save(@RequestBody Size size){
        return sizeServiceImp.save(size);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        sizeServiceImp.delete(id);
    }


}
