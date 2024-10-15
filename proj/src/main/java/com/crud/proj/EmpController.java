package com.crud.proj;

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
class EmpController {
    EmployeeService eService=new EmployeeServiceImp();
    
    @Autowired
    // EmployeeService eService; // DI

    @GetMapping("employees")
    public List<Employee> getEmployees() {
        return eService.readEmployee();
    }

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee emp) {
        return eService.createEmployee(emp);
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(!eService.deleteEmployee(id))   return "Cannot Delete";
        return "Deleted Successfully";
    }
    
}