package com.example.CRUD.service;

import com.example.CRUD.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployee(Integer employeeId);
    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Integer employeeId, EmployeeDto  updatedEmployee);
    void deleteEmployee(Integer employeeId);
}
