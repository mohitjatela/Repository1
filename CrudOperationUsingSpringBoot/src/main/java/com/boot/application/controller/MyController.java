package com.boot.application.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.application.entity.Employee;
import com.boot.application.service.EmployeeService;

@Controller
@RequestMapping(path = "/emp")
public class MyController {

	@Autowired
	private EmployeeService employeeService;

//	Index Page
	@GetMapping("/index")
	public String index() {
		System.out.println("Working with JSP Page.");
		return "index";
	}

//	Call Registration Page
	@GetMapping("/registration")
	public String getRegistration() {
		return "registration";
	}

//	save it in database
	@GetMapping("/form-handler")
	public String addRecord(@ModelAttribute Employee employee, Model model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "registration";
		} else {
			employeeService.saveEmployee(employee,model);
		}
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		model.addAttribute("employee",list);
		model.addAttribute("msg", "data recoreded succesfully");
//		findAll(model);
		return "index";
	}

//	Call UpdatePage
	@GetMapping("/updatePage")
	public String getUpdate() {
		return "updatePage";
	}

//	Update Values In Database
	@GetMapping("/update")
	public String updateRecord(@ModelAttribute Employee employee, Model model) {
		employeeService.updateEmployee(employee, model);
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		model.addAttribute("employee",list);
		return "index";
	}

//	Call DeletePage 
	@GetMapping("/deletePage")
	public String getDeletePage() {
		return "deletePage";
	}

//	Delete Object in Database
	@GetMapping("/delete")
	public String setDelete(@RequestParam Integer id, Model model) {
		Employee employee=employeeService.deleteEmployee(id, model);
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		model.addAttribute("employee",list);
		return "index";
	}

//	Call FindPage 
	@GetMapping("/findPage")
	public String getFindPage() {
		return "findPage";
	}

//	Find Object in Database
	@GetMapping("/find")
	public String find(@RequestParam Integer id, Model model) {
		Employee employee=employeeService.findEmployee(id, model);
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		model.addAttribute("employee",list);
		return "index";
	}

//	FindAll Object in Database
	@GetMapping("/findAllPage")
	public String findAll(Model model) {
		List<Employee> list=employeeService.findAllEmployee(model);
		model.addAttribute("employee", list);
		return "index";
	}
}
