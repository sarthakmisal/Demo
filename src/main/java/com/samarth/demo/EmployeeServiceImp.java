package com.samarth.demo;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
/**
 * EmployeeServiceImp
 */
@Service
public class EmployeeServiceImp implements EmployeeService {
    private List<Employee> list =new ArrayList<>();
    @Override
    public String createEmp(Employee emp) {
        list.add(emp);
        return "Created Successfully";
    }
    @Override
    public List<Employee> getEmployees() {
        return list;
    }
    @Override
    public boolean deleteEmployee(Long id) {
        this.list.remove(id);
        return true;
    }
}