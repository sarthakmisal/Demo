package com.samarth.demo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmpController {
    @Autowired
    EmployeeService emp;
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
    public String delEmployee(@PathVariable Long id){
        if(this.emp.deleteEmployee(id)) return "Deleted Successfully";
        return "Unable to delete";
    }
}