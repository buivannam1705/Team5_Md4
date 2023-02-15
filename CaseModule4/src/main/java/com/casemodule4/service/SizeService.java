package com.casemodule4.service;

import com.casemodule4.model.Size;
import com.casemodule4.repository.ISizeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    @Autowired
    ISizeRepo sizeRepo;
    public List<Size> getAllSize(){
        return (List<Size>) sizeRepo.findAll();
    }
    public Size saveSize(Size size){
        return sizeRepo.save(size);
    }
    public Size findSizeById(long   id){
        return sizeRepo.findById(id).get();
    }
    public Size deleteSize(long id){
        Size size=findSizeById(id);
        sizeRepo.deleteById(id);
        return size;
    }
}
