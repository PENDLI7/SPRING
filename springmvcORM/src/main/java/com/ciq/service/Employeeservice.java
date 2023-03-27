package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;



public interface Employeeservice {
	void save(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	Employee findbyid(int id);
	List<Employee>findAllemployees();


}
