package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	// http://localhost:9090/spring-mvc/
	public String main() {
		return "mainpage";
	}
	
	@RequestMapping("/profile")
	//http://localhost:9090/spring-mvc/profile
	public String myPro() {
		return "myprofile";
	}
}
