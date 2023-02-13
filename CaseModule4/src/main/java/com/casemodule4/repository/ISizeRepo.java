package com.casemodule4.repository;

import com.casemodule4.model.Size;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ISizeRepo extends PagingAndSortingRepository<Size,Long> {
}
