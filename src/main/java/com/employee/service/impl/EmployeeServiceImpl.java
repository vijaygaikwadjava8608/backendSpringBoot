package com.employee.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.employee.controller.ResourceNotFoundException;
import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.mapper.EmployeeMapper;
import com.employee.repository.EmpoloyeeRepository;
import com.employee.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmpoloyeeRepository empoloyeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = empoloyeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }

    @Override
    public EmployeeDTO getEmployeeById(long employeeID) {
        Employee employee = empoloyeeRepository.findById(employeeID).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exist with given ID : " + employeeID));
        return EmployeeMapper.mapToEmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> empList = empoloyeeRepository.findAll();
        return empList.stream().map((employee) -> EmployeeMapper.mapToEmployeeDTO(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployee) {

        Employee employee = empoloyeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist : " + id));
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
        Employee updateEmployeeObj = empoloyeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDTO(updateEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = empoloyeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist : " + id));
        empoloyeeRepository.deleteById(id);

    }

}