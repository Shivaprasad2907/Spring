package com.spring.employee.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
