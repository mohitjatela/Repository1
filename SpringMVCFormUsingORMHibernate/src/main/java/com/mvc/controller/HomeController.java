package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.entity.User;
import com.mvc.userservice.UserService;



@Controller
public class HomeController {
	@Autowired
	private UserService service;
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("header","Registration Page" );
	}
	@RequestMapping("/form")
	public String form() {

		return "form";
	}

	@RequestMapping(path = "process",method = RequestMethod.POST)
	public String process(@ModelAttribute("user") User user,Model m) {
		service.createUser(user);
		return "page";}
}
