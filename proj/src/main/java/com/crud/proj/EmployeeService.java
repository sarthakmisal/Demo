package com.crud.proj;
import java.util.List;
public interface EmployeeService {
    String createEmployee(Employee emp);
    List<Employee> readEmployee();
    boolean deleteEmployee(Long id);
}