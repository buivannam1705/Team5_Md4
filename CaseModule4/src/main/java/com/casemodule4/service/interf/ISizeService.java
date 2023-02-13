package com.casemodule4.service.interf;

import java.util.List;

public interface ISizeService<Size> {
    List<Size> getAll();

    Size save(Size size);

    void delete(int id);
}
