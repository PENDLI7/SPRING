package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Employee;
import com.ciq.service.Employeeserviceimpl;

@Controller
public class EmployeeController {
@Autowired	
 public Employeeserviceimpl serviceimpl;

@GetMapping("/addemployee")
public String insert(Employee e) {
	
	return "Add";	
}
@PostMapping("/save")	
public ModelAndView save(Employee employee) {
	serviceimpl.save(employee);
	return new ModelAndView("redirect:list");
	}
@GetMapping("/list")
public ModelAndView getall() {
List<Employee> findAllemployees=serviceimpl.findAllemployees();
return new ModelAndView("getall","map",findAllemployees);
}

@GetMapping("/remove")
public ModelAndView delete(Employee employee) {
	serviceimpl.delete(employee);
	return new ModelAndView("redirect:list");
}
@GetMapping("/find")
public ModelAndView  findby(@RequestParam int id) {
	
	Employee e = serviceimpl.findbyid(id);
	
	
	
	return new ModelAndView("update","map",e);
	}
@PostMapping("/updated")
public String findbyid(Employee e) {
	serviceimpl.update(e);
	return "redirect:list";
}

//}
}
