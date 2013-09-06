package com.fruitstore.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fruitstore.domain.LoginForm;
 
@Controller
public class LoginController {
	
	@RequestMapping(value = "login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm loginForm) {
		
		String username = loginForm.getUsername();
		
		ModelAndView mv = new ModelAndView("loginSuccess", "loginForm",
				"LOGIN SUCCESS, " + username);
		return mv;
	}
	
	@RequestMapping(value = "goLogin", method = RequestMethod.GET)
	public String goLogin(){
		System.out.println("Do nothing, just go to another page.");
		return "account/login";
	}
	
	
	
}
