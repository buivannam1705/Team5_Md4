package com.casemodule4.service.interf;

import com.casemodule4.model.BillDetail;

import java.util.List;

public interface IBillDetailService <Bill>{
    List<Bill> getAll();
    BillDetail save(Bill bill);

    void delete(int id);

    BillDetail findbyId(int id);
}
