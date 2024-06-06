package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.entity.Employee;

public interface EmpoloyeeRepository extends JpaRepository<Employee, Long> {
    // You can add custom queries here if needed
}