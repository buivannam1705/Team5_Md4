package com.casemodule4.repository;

import com.casemodule4.model.Bill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IBillRepo extends PagingAndSortingRepository<Bill,Integer> {
    @Query("select b from Bill b where b.account.id=:account_id and b.Status=:status")
    Bill findBillsByStatusAndAccount_Id(int account_id,int status);

    @Query("select b from Bill b where b.account.username=:username")
    List<Bill> findBillsByAccount_Username(String username);

    @Query("select b from Bill b where b.account.username=:username and b.Status=:status")
    List<Bill> findBillsByAccount_UsernameAndStatus(String username,int status);

    @Query("delete from Bill c where c.Status=:status")
    void deleteByStatus(int status);
}
