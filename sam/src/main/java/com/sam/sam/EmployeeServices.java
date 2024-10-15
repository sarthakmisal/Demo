package com.sam.sam;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getEmployees();
    String createEmployee(Employee emp);
    boolean deleteEmployee(Long id);
}