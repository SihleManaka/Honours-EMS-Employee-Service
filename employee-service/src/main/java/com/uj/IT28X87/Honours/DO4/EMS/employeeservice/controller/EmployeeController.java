package com.uj.IT28X87.Honours.DO4.EMS.employeeservice.controller;

import com.uj.IT28X87.Honours.DO4.EMS.employeeservice.entity.Employee;
import com.uj.IT28X87.Honours.DO4.EMS.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getAllEmployee(){

        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){

        return employeeService.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee){

        return  employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    //ResponseStatus(HttpStatus.)
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody Employee employee){

        return employeeService.getEmployeeById(employeeId)
                .map(savedEmployee ->{
                    savedEmployee.setFirst_name(employee.getFirst_name());
                    savedEmployee.setLast_name(employee.getLast_name());
                    savedEmployee.setAddress(employee.getAddress());
                    savedEmployee.setContact_mumber(employee.getContact_mumber());
                    savedEmployee.setDepartment(employee.getDepartment());
                    savedEmployee.setPosition(employee.getPosition());
                    savedEmployee.setUsername(employee.getUsername());
                    savedEmployee.setPassword(employee.getPassword());

                    Employee updatedEmployee = employeeService.updateEmployee(savedEmployee);
                    return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.OK);
                }).orElseGet(()->ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){

        employeeService.deleteEmployee(id);

        return new ResponseEntity<String>("Employee deleted",HttpStatus.OK);
    }
}
