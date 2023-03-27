package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.EmployeeDaoimpl;
import com.ciq.model.Employee;
import com.ciq.service.Employeeserviceimpl;

public class EmployeeTest {

	public static void main(String[] args) {
Employee em=new Employee(4, "swamy",25000.00);
ApplicationContext context=new ClassPathXmlApplicationContext("spring-servlet.xml");
//EmployeeDaoimpl bean = context.getBean(EmployeeDaoimpl.class);
Employeeserviceimpl bean = context.getBean(Employeeserviceimpl.class);
//bean.save(em);
bean.update(em);


	}

}
