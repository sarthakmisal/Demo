package com.sarthak.misal;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmpController {
    List<Employee> list=new ArrayList<>();  
    @GetMapping("employees")
    public List<Employee> getEmployees() {
        Employee emp=new Employee();
        list.add(emp);
        return list; 
    }
    @PostMapping("employees")
    public String saveEmployees(@RequestBody Employee emp) {
        // list.add();
        list.add(emp);
        return new String("Saved Successfully");
    }
    
}