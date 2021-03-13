package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/signin")
	// http://localhost:9090/spring-mvc/signin
	public String myLogin() {
		return "login";
	}
	
	@RequestMapping("/loginprocess")
	// http://localhost:9090/spring-mvc/loginprocess
	public String formProcess(HttpServletRequest request, Model model) {
		// get data from my form
		String userName = request.getParameter("user");
		String password = request.getParameter("pass");
		// doing process in data
		String newUserName = "(username = " + userName.toUpperCase() + ")";
		String newPassword = "(password = " + password + ")";
		
		model.addAttribute("myUserName",newUserName);
		model.addAttribute("myPassword",newPassword);		
		return "main"; 
	}
}


































