package com.crud.proj;

import java.util.ArrayList;
import java.util.List;

class EmployeeServiceImp implements EmployeeService {
    List<Employee> list=new ArrayList<>();
    @Override
    public String createEmployee(Employee emp){
        this.list.add(emp);
        return "Saved Successfully";
    }
    @Override
    public List<Employee> readEmployee(){
        return this.list;
    }
    @Override
    public boolean deleteEmployee(Long id){
        this.list.remove(id);
        return true;
    }
}