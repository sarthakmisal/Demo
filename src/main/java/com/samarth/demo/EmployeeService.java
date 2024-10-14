package com.samarth.demo;

import java.util.List;

/**
 * EmployeeService
 */
public interface EmployeeService {
    String createEmp(Employee emp);
    List<Employee> getEmployees();
    boolean deleteEmployee(Long id);
    // Employee updatEmployee();
}