package com.spring.employee.EmployeeService;

import com.spring.employee.Employee;
import com.spring.employee.EmployeeRepository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServices implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServices(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getallemployee(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id){
        return employeeRepository.findById(id).orElseThrow();
    }


    @Override
    public Employee saveEmployee(Employee employee){
         return employeeRepository.save(employee);
    }




    @Override
    public Employee updateEmployee(Employee employee, int id){
        Employee existEmployee = employeeRepository.findById(id).orElseThrow();
        existEmployee.setFirstname(employee.getFirstname());
        existEmployee.setLastname(employee.getLastname());
        existEmployee.setAge(employee.getAge());
        existEmployee.setSalary(employee.getSalary());
         employeeRepository.save(existEmployee);
        return existEmployee;
    }




}
