package com.boot.application.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.boot.application.entity.Employee;
import com.boot.application.repositoryinterface.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

//	Save Employees
	public void saveEmployee(Employee employee,Model model) {
		employeeRepository.save(employee);
//		model.addAttribute("employee", employee);

	}

//	update Employees
	public void updateEmployee(Employee employee, Model model) {
		Optional<Employee> optional = employeeRepository.findById(employee.getId());
		if (!optional.isEmpty()) {
			Employee emp = optional.get();
			emp.setFirstName(employee.getFirstName());
			emp.setLastName(employee.getLastName());
			emp.setExperience(employee.getExperience());
			emp.setSalary(employee.getSalary());
			employeeRepository.save(emp);
//			model.addAttribute("employee",emp);
			model.addAttribute("msg", "Record Updated successfully");
		} else {
			model.addAttribute("msg", "Record not found");
		}
		
	}

//	delete Employees by given id
	public Employee deleteEmployee(Integer id, Model model) {
		Employee emp=null;
		Optional<Employee> optional = employeeRepository.findById(id);
		if (!optional.isEmpty()) {
			emp = optional.get();
			employeeRepository.delete(emp);
			model.addAttribute("employee",emp);
			model.addAttribute("msg", "Data Deleted Successfully");
			return emp;
		}
		model.addAttribute("msg", "Data Not Found");
		return emp;
	}

//	find Employess with the given id
	public Employee findEmployee(Integer id, Model model) {
		Employee emp=null;
		Optional<Employee> optional = employeeRepository.findById(id);
		if (!optional.isEmpty()) {
			emp = optional.get();
			model.addAttribute("employee", emp);
			model.addAttribute("msg", "Data Found");
			return emp;
		}
		model.addAttribute("msg", "Data Not Found");
		return emp;
	}

//	find AllEmployess
	public List<Employee> findAllEmployee(Model model) {
		List<Employee> list = employeeRepository.findAll();
		/*
		 * if(!list.isEmpty()) { model.addAttribute("employee", list);
		 *****this code is not working
		 */
		model.addAttribute("msg", "Data Found");
		return list;
	}
}
