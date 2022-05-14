package com.uj.IT28X87.Honours.DO4.EMS.employeeservice.service;

import com.uj.IT28X87.Honours.DO4.EMS.employeeservice.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    Employee updateEmployee(Employee updatedEmployee);

    void deleteEmployee(Long id);
}
