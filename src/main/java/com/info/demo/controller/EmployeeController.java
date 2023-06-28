package com.info.demo.controller;

import com.info.demo.entity.Employee;
import com.info.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping(value = "/employeeList")
    public List<Employee> employeeList() {
        return service.findAll();
    }
}
