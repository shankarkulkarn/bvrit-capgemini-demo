package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.entity.Employee;
import com.cg.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService  employeeService ;
	
	//@RequestMapping(method=RequestMethod.GET,value="employee")
	  @GetMapping("employee")
	public  List<Employee>  getAllEmployees()
	{
		  return employeeService.findall();
				  
	}
	@GetMapping("employee/{id}") 
	public Employee  findEmployeeById(@PathVariable("id") int id)
	{
		  return employeeService.findEmployeeById(id);
	}
	
	@DeleteMapping("employee/{id}") 
	public Employee  deleteEmployeeById(@PathVariable("id") int id)
	{
		  return employeeService.deleteEmployeeById(id);
	}
	
	@PostMapping("employee") 
	public Employee  addEmployeeById(@RequestBody Employee  employee)
	{
		  return employeeService.addEmployee(employee);
	}
	
	
}
