package com.ciq.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeserviceDaoimpl;
@Controller
public class Employeecontroller {
	@Autowired
	private EmployeeserviceDaoimpl serviceimpl;
	
	@GetMapping("/insert")
	public String add() {
		return "openpage";
	}
	
	@PostMapping("/save")
	public ModelAndView save(Employee e) {
//	public ModelAndView save(@Validated @ModelAttribute("e")Employee e,BindingResult result) {
//		if(result.hasErrors()) {
//			return new ModelAndView("saveerror");	
//		}
		serviceimpl.save(e);
		ModelAndView model=new ModelAndView("redirect:list");
		return model;
		
	}
	@GetMapping("/list")
	public ModelAndView get() {
//		String error="error";
//		if(error.equalsIgnoreCase("error")) {
//			throw new NullPointerException("null point exception occured");
//		}
		List<Employee> e = serviceimpl.GetAll();
	
return new ModelAndView("getall","map",e);
}
//	@ExceptionHandler(value=NullPointerException.class)
//	public String nullpoint() {
//		return "nullpoint";
//		
//	}
//	@ExceptionHandler(value=SQLException.class)
//	public String sqlexcepti() {
//		return "nullpoint";
//		
//	}
	@GetMapping("/remove")
	public String remove(@RequestParam Integer id) {
		int delete = serviceimpl.delete(id);
		return "redirect:list";
		
	}
	
	@GetMapping("/find")
    public String findbyid(@RequestParam Integer id,Model m) {
		
		Employee employee = serviceimpl.findbyid(id);
		m.addAttribute("e",employee);
		
		return "update";
		
	}
	
	@PostMapping("/update")
	public String update(Employee e) {
		int update = serviceimpl.update(e);
		return  "redirect:list";
	}

	
}