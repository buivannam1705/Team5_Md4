package com.casemodule4.service.Imp;

import com.casemodule4.model.Bill;
import com.casemodule4.repository.IBillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillService {
    @Autowired
    IBillRepo billRepo;

    public List<Bill> findByAccount_usernameAndStatus(String username){
        return billRepo.findBillsByAccount_Username(username);
    }

    public Bill findByAccount_IdAndStatus(int id ,int status){
        return billRepo.findBillsByStatusAndAccount_Id(id,status);
    }

    public List<Bill> findByUsernameAndStatus(String username,int status){
        return billRepo.findBillsByAccount_UsernameAndStatus(username,status);
    }

    public Bill findById(int id){
        return billRepo.findById(id).get();
    }

    public Bill save(Bill bill){
        return billRepo.save(bill);
    }

    public void remove(int id){
        billRepo.deleteById(id);
    }
}
