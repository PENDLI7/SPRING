package com.ciq.service;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeServiceDao {
	int save(Employee e);
	int update(Employee e);
	int delete(Integer id);
	List<Employee>GetAll();
	Employee findbyid(Integer id);
	

}
