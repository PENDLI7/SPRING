package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String save(Employee e) {
		serviceimpl.save(e);
		return "redirect:list";
		
	}
	@GetMapping("/list")
	public ModelAndView get() {
		List<Employee> e = serviceimpl.GetAll();
	
return new ModelAndView("getall","map",e);
}
	@GetMapping("/edit")
	public String edit() {
		return "update";
		}
	@PostMapping("/update")
	public String update(Employee e) {
		int update = serviceimpl.update(e);
		return  "redirect:list";
	}
	@GetMapping("/remove")
	public String remove(Integer id) {
		int delete = serviceimpl.delete(id);
		return "redirect:list";
		
	}
	@PostMapping("/modify")
	public String find(Integer id) {
//		serviceimpl.findbyid(id);
		return "findbyid";	
		}
	@GetMapping("/find")
    public String findbyid(@RequestParam Integer id,Model m) {
		
		Employee employee = serviceimpl.findbyid(id);
		m.addAttribute("e",employee);
		
		return "findbyid";
		
	}
}