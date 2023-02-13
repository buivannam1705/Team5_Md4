package com.casemodule4.service.Imp;

import com.casemodule4.model.Size;
import com.casemodule4.repository.ISizeRepo;
import com.casemodule4.service.interf.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeServiceImp implements ISizeService<Size> {
    @Autowired
    ISizeRepo iSizeRepo;

    @Override
    public List<Size> getAll() {
        return (List<Size>) iSizeRepo.findAll();
    }

    @Override
    public Size save(Size size) {
        return iSizeRepo.save(size);
    }

    @Override
    public void delete(int id) {
        iSizeRepo.deleteById(id);
    }

    public Size findById(int id){
        return iSizeRepo.findById(id).get();
    }
}
