package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.model.Employee;

@Repository
@Transactional
public class EmployeeDaoimpl implements EmployeeDao {
	@Autowired
	public HibernateTemplate hibernateTemplate;
	
	static 
	{
		
		System.out.println("dao-------");
	}

	@Override
	public void save(Employee employee) {
		System.out.println("before instructions:");
		hibernateTemplate.save(employee);
		System.out.println("after instruction:");

	}

	public void update(Employee employee) {

		hibernateTemplate.update(employee);

	}

	@Override
	public void delete(Employee employee) {
		hibernateTemplate.delete(employee);
	}

	@Override
	public Employee findbyid(int id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> findAllemployees() {

		return hibernateTemplate.loadAll(Employee.class);

	}

}
