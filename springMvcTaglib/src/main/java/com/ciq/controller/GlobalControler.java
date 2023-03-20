package com.ciq.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalControler {
	@ExceptionHandler(value=Exception.class)
	public String Exception() {
		return "exception";
		
	}
	

}
