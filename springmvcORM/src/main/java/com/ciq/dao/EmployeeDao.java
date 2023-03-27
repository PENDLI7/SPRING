package com.ciq.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;


@Repository
public interface EmployeeDao {
	void save(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	Employee findbyid(int id);
	List<Employee>findAllemployees();

}
