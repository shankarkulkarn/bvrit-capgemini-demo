package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.dao.EmployeeDao;
import com.cg.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao  employeeDao;
	
	public Employee   findEmployeeById(int employeeId)
	{
		return employeeDao.findEmployeeById(employeeId);
	}
	@Override
	public List<Employee> findall() {
		// TODO Auto-generated method stub
		return employeeDao.findall();
	}
	@Override
	public Employee deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployeeById(employeeId);
	}
	public Employee  addEmployee(Employee employee)
	{
		return employeeDao.addEmployee(employee);
	}

}
