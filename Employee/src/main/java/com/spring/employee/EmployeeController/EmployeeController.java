package com.spring.employee.EmployeeController;


import com.spring.employee.Employee;
import com.spring.employee.EmployeeService.EmployeeService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

 
 	@GetMapping
 	public List<Employee> getallemployee(){
 		return employeeService.getallemployee();
 	}
 	
 	
 	@GetMapping("{id}")
 	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id){
 		return new ResponseEntity<Employee>(employeeService.getEmployee(id), HttpStatus.OK);
 	}
 	
 	 
  
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
    
    @PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
    

}

