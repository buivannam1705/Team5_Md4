package com.casemodule4.service.interf;

import java.util.List;

public interface IBillService <Bill>{
    List<Bill> getAll();
    Bill save(Bill bill);

    void delete(int id);

    Bill findbyId(int id);
}
