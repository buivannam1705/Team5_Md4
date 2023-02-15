package com.casemodule4.controller;

import com.casemodule4.model.Bill;
import com.casemodule4.service.Imp.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bill")
@RestController
public class BillController {
    @Autowired
    BillService billService;

    @GetMapping
    public List<Bill> all(){
        return billService.getAll();
    }
    @GetMapping("/{id}")
    public Bill showEdit(@PathVariable int id){
        return billService.findbyId(id);
    }

    @PostMapping
    public Bill save(@RequestBody Bill bill){
        return billService.save(bill);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billService.delete(id);
    }

}
