package com.uj.IT28X87.Honours.DO4.EMS.employeeservice.service;

import com.uj.IT28X87.Honours.DO4.EMS.employeeservice.entity.Employee;
import com.uj.IT28X87.Honours.DO4.EMS.employeeservice.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {

        return iEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return iEmployeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {

        return iEmployeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee updatedEmployee) {

        return iEmployeeRepository.save(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {

        iEmployeeRepository.deleteById(id);
    }
}
