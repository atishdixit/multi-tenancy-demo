package com.info.demo.service;

import com.info.demo.entity.Employee;
import com.info.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
       return employeeRepository.findAll();
    }
}
