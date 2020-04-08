package com.cg.demo.dao;

import java.util.List;

import com.cg.demo.entity.Employee;

public interface EmployeeDao {

	public List<Employee>  findall();
	
	public Employee   findEmployeeById(int employeeId);
	
	public  Employee deleteEmployeeById(int employeeId);
	
	public Employee  addEmployee(Employee employee);
}
