package com.example.ruleengine.service;
import com.example.ruleengine.entity.Data1;
import java.util.List;
public interface DataService {

    Data1 createData(Data1 data1);
    List<Data1> getalldata();
    void detelebyid(int id);

}
