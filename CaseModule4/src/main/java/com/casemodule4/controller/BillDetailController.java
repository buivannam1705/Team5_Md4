package com.casemodule4.controller;

import com.casemodule4.model.Bill;
import com.casemodule4.model.BillDetail;
import com.casemodule4.service.Imp.BillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/billDetail")
@RestController
public class BillDetailController {
    @Autowired
    BillDetailService billDetailService;

    @GetMapping
    public  List<BillDetail> all(){
        return billDetailService.getAll();
    }
    @GetMapping("/{id}")
    public BillDetail showEdit(@PathVariable int id){
        return billDetailService.findbyId(id);
    }

    @PostMapping
    public BillDetail save(@RequestBody BillDetail billDetail){
        return billDetailService.save(billDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billDetailService.delete(id);
    }
}
