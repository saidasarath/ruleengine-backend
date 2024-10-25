package com.example.ruleengine.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ruleengine.entity.Data1;
import com.example.ruleengine.service.DataService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
@RestController
@RequestMapping("/data")

public class DataController {
    @Autowired
    private DataService dataService;
    @PostMapping
    public ResponseEntity<Data1> createdata(@RequestBody Data1 data1){
        return ResponseEntity.ok(dataService.createData(data1));
    }
    @GetMapping("/all")
    public ResponseEntity<List<Data1>> getAllData(){
        return ResponseEntity.ok(dataService.getalldata());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteData(@PathVariable("id") int id){
        dataService.detelebyid(id);
        return ResponseEntity.ok("deleted "+id);
    }
    
    
}
