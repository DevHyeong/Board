package com.myapp.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login.do")
	public String login(HttpServletRequest req, HttpServletResponse res) {
		
		
		
		return "login/login";
	}
	
}
