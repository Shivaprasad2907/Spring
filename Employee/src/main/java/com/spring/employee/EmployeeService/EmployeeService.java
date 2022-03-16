package com.spring.employee.EmployeeService;

import java.util.List;

import com.spring.employee.Employee;

public interface EmployeeService {

    Employee getEmployee(int id);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee, int id);

	List<Employee> getallemployee();

}
