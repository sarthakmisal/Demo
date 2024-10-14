package com.samarth.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmpController {
    EmployeeServiceImp emp=new EmployeeServiceImp();
    // List<Employee> list = new ArrayList<>();
    @GetMapping("emp")
    public List<Employee> getEmployees() {
        return emp.getEmployees();
    }

    @PostMapping("emp")
    public String createEmployee(@RequestBody Employee emp) {
        return this.emp.createEmp(emp);
    }
    @DeleteMapping("emp/{id}")
    public String deleteEmployee(@RequestParam Long id){
        if(this.emp.deleteEmployee(id)) return "Deleted Successfully";
        return "Unable to delete";
    }
}