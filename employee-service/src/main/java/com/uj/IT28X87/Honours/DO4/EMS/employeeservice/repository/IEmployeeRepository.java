package com.uj.IT28X87.Honours.DO4.EMS.employeeservice.repository;

import com.uj.IT28X87.Honours.DO4.EMS.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {

/*
    @Override
    Optional<Employee> findById(Long aLong);
*/


}
