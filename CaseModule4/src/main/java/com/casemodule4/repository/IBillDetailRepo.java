package com.casemodule4.repository;

import com.casemodule4.model.BillDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IBillDetailRepo extends PagingAndSortingRepository<BillDetail,Integer> {
    @Query("SELECT b from BillDetail b where b.bill.id=:bill_id")
    List<BillDetail> findBillDetailByBill_Id(int bill_id);

}
