package com.casemodule4.service.Imp;

import com.casemodule4.model.Bill;
import com.casemodule4.repository.IBillRepo;
import com.casemodule4.service.interf.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillService implements IBillService<Bill> {
    @Autowired
    IBillRepo iBillRepo;

    @Override
    public List<Bill> getAll() {
        return (List<Bill>) iBillRepo.findAll();
    }

    @Override
    public Bill save(Bill bill) {
        return iBillRepo.save(bill);
    }

    @Override
    public void delete(int id) {
        iBillRepo.deleteById(id);

    }

    @Override
    public Bill findbyId(int id) {
        return iBillRepo.findById(id).get();
    }
}
