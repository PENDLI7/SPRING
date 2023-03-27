package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDaoimpl;
import com.ciq.model.Employee;
@Service
public class Employeeserviceimpl implements Employeeservice {
	@Autowired
	public EmployeeDaoimpl impl;

	@Override
	public void save(Employee employee) {
		impl.save(employee);

	}

	@Override
	public void update(Employee employee) {
		impl.update(employee);

	}

	@Override
	public void delete(Employee employee) {
impl.delete(employee);
	}

	@Override
	public Employee findbyid(int id) {
		Employee findbyid = impl.findbyid(id);
		return findbyid;
	}

	@Override
	public List<Employee> findAllemployees() {
		return impl.findAllemployees();
	}

}
