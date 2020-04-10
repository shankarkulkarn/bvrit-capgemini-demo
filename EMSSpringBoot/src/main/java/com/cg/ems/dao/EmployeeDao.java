package com.cg.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	   @Query("select e from Employee where salary=:sal")
	   public List<Employee>  findEmployeeBySalary(@Param("sal") int salary); 
	
	   @Query("delete from Employee where salary = :sal")
	   @Modifying
       public void deleteEmployeeBySalary(@Param("sal") int salary);

}
