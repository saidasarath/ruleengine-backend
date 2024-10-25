package com.example.ruleengine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ruleengine.entity.Data1;
import com.example.ruleengine.repo.DataRepo;
import com.example.ruleengine.service.DataService;
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    DataRepo dataRepo;
    @Override
    public Data1 createData(Data1 data1) {
        System.out.println(data1);
        return dataRepo.save(data1);
    }
    @Override
    public List<Data1> getalldata() {
        return dataRepo.findAll();
    }
    @Override
    public void detelebyid(int id) {
        dataRepo.deleteById(id);
    }    
}
