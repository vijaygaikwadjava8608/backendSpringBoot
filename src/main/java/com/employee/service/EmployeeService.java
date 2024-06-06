package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(long employeeID);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployee);

    void deleteEmployee(Long id);

}