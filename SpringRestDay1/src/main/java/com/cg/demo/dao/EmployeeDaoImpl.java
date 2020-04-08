package com.cg.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.demo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	Map<Integer,Employee >  map = new HashMap<>();
	
	public EmployeeDaoImpl() {
		Employee  e1= new Employee(1001,"John",9000);
		Employee  e2= new Employee(1001,"John",9000);
		map.put(1001, e1);
		map.put(1002, e2);
	}
	@Override
	public List<Employee> findall() {
		Collection<Employee> values = map.values();
		List<Employee>   list = new ArrayList<>(values);
		return list;
	}

	public Employee   findEmployeeById(int employeeId)
	{
		return map.get(employeeId);
	}
	
	public  Employee deleteEmployeeById(int employeeId)
	{
		return  map.remove(employeeId);
	}
	
	public Employee  addEmployee(Employee employee)
	{
		map.put(employee.getEmployeeId(), employee);
		
		return employee ;
	}
}
