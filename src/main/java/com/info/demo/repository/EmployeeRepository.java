package com.info.demo.repository;

import ch.qos.logback.core.model.INamedModel;
import com.info.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();
}
