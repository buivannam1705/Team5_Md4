package com.casemodule4.repository;

import com.casemodule4.model.Bill;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBillRepo extends PagingAndSortingRepository<Bill,Integer> {
}
