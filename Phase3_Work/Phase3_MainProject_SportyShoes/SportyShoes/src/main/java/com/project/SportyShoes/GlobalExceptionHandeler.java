package com.project.SportyShoes;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandeler {
	@ExceptionHandler(Exception.class)
	public String handleException1(Exception e) {
		e.printStackTrace();
		return "Some error has occurred, please contact to administrator";
	}
}
