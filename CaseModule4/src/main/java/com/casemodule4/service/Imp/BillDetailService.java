package com.casemodule4.service.Imp;

import com.casemodule4.model.BillDetail;
import com.casemodule4.repository.IBillDetailRepo;
import com.casemodule4.service.interf.IBillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDetailService implements IBillDetailService<BillDetail> {
    @Autowired
    IBillDetailRepo billDetailRepo;

    @Override
    public List<BillDetail> getAll() {
        return (List<BillDetail>) billDetailRepo.findAll();
    }

    @Override
    public BillDetail save(BillDetail billDetail) {
        return billDetailRepo.save(billDetail);
    }

    @Override
    public void delete(int id) {
        billDetailRepo.deleteById(id);
    }

    @Override
    public BillDetail findbyId(int id) {
        return billDetailRepo.findById(id).get();
    }
}
