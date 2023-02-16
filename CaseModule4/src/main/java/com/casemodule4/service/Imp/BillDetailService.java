package com.casemodule4.service.Imp;

import com.casemodule4.model.BillDetail;
import com.casemodule4.repository.IBillDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillDetailService {
    @Autowired
    IBillDetailRepo billDetailRepo;

    public List<BillDetail> listBillByBill_id(int id){
        return billDetailRepo.findBillDetailByBill_Id(id);
    }

    public BillDetail save(BillDetail billDetail){
        return billDetailRepo.save(billDetail);
    }

    public void delete(int id){
        billDetailRepo.deleteById(id);
    }

}
