package com.marticus.EmployeeManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.marticus.EmployeeManagement.Entity.User;
import com.marticus.EmployeeManagement.Service.EmployeeService;



@Controller
public class AuthenticateController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/login")
	public String login(User user, Model model) {
		boolean isUserPresent = employeeService.authenticateUser(user);
	
		if (isUserPresent) {
			return "redirect:/employees/read-employee";
		}
		model.addAttribute("wrongpassword", "Use Correct Name and Password");
		return "login";
	}
	@PostMapping("/login")
	public String loginuser(User user, Model model) {
		boolean isUserPresent = employeeService.authenticateUser(user);
	
		if (isUserPresent) {
			return "redirect:/employees/read-employee";
		}
		model.addAttribute("wrongpassword", "Username or Password is wrong");
		return "login";
	}

}
