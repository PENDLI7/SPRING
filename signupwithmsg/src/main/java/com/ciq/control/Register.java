package com.ciq.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {
	@RequestMapping(value="/reg" , method=RequestMethod.GET)
	public ModelAndView signup() {
		
		ModelAndView model=new ModelAndView("register");
		return model;
		
	}
	@RequestMapping(value="/reg", method = RequestMethod.POST)
	public ModelAndView logedin(String fname,String lname,String email,String userid,String password) {
		String s="First name:"+fname+"Last Name:"+lname+"Emailid :"+email+"User id:"+userid+"Password:"+password;
		return new ModelAndView("log","msg",s);	
		
	}

}
