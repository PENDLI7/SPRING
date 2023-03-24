package com.ciq.controller;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeserviceDaoimpl;

@Controller
public class ServiceController {
	@Autowired
	private EmployeeserviceDaoimpl impl;
	
//	@ResponseBody
//	@GetMapping("/air")
//	public String get(){
//		return "wellcome to my page";
//	}
	@ResponseBody
	@GetMapping("/jithu")
	 public List<Employee> getall(){
		return impl.GetAll();
		 
	 }
	@ResponseBody
	@GetMapping("/finder/{id}")
	public Employee getbyid(@PathVariable Integer id) {
		return impl.findbyid(id);
	}
	@ResponseBody
	@PostMapping("/saved")
	public int insert(@RequestBody Employee employee) {
		return impl.save(employee);
	}
	@ResponseBody
	@GetMapping("/removed/{id}")
	public int delete(@PathVariable Integer id) {
		return impl.delete(id);
	}
@ResponseBody
@PostMapping("/updated")
public int update(@RequestBody Employee employee) {
		return impl.update(employee);
	
}
}
