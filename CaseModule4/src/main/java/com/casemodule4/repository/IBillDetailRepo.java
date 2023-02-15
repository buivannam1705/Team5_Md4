package com.casemodule4.repository;

import com.casemodule4.model.BillDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBillDetailRepo extends PagingAndSortingRepository<BillDetail,Integer> {
}
