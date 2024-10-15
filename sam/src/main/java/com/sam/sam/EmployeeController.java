package com.sam.sam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.ArrayList;

/**
 * EmployeeController
 */
@RestController
public class EmployeeController {
    List<Employee> list = new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getEmployees() {
        return this.list;
    }

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee emp) {
        list.add(emp);
        return new String("Added Successfully");
    }

    
}