package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDaoimpl;
import com.ciq.pojo.Employee;
@Service
public class EmployeeserviceDaoimpl implements EmployeeServiceDao {
	@Autowired
	private EmployeeDaoimpl impl;

	@Override
	public int save(Employee e) {
		return impl.save(e);

	}

	@Override
	public int update(Employee e) {
		int update = impl.update(e);
		return update;
	}

	@Override
	public int delete(Integer id) {
		int delete = impl.delete(id);
		
		return delete;
	}

	@Override
	public List<Employee> GetAll() {
		return impl.GetAll();
	}

	@Override
	public Employee findbyid(Integer id) {
		Employee findbyid = impl.findbyid(id);
		return findbyid;
	}

}
