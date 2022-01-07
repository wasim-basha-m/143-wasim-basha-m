package com.marticus.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.EmployeeManagement.Entity.Employee;
import com.marticus.EmployeeManagement.Service.EmployeeService;

@Controller
@RequestMapping(path="/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/read-employee")//TO READ ALL EMPLOYEES
    public String showReadEmployeePage(Model model, Employee employee) {
        model.addAttribute("employees", employeeService.findAll());
        return "read-employee";
    }

    @GetMapping("/create-employee")// GETTING CREATE EMPLOYEE PAGE
    public String showCreateEmployeePage(Model model) {
        model.addAttribute("command", new Employee());
        return "createemployee";
    }

    @PostMapping(value = "/create-employee")// ADDING IT TO THE DATA BASE
    public String createEmployee(Employee employee,Model model) {
        Employee emp=employeeService.saveEmployee(employee);
        model.addAttribute(employee);        
        return  "employeedetails";
    }

    @GetMapping(value = "/update-employee/{id}")// GETTING UPDATE EMPLOYEE PAGE
    public String showUpdateEmployeePage(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", employeeService.findById(id));
        return "update-employee";
    }

    @PostMapping(value = "/update-employee/{id}")// UPDATING IT TO DATA BASE
    public String updateEmployee(@PathVariable long id, @ModelAttribute("employee") Employee employee) {
        employeeService.updateEmployee(id, employee);
        return "redirect:/employees/read-employee";
    }

    @GetMapping(value = "/delete-employee/{id}")// DELETING THE EMPLOYEE BY FINDING THEIR ID FROM THE DATA BASE
    public String deleteEmployee(@PathVariable long id) {
        employeeService.deleteById(id);
        return "redirect:/employees/read-employee";
    }
    @GetMapping(value="/search")// GETTING EMPLOYEE SEARCH PAGE
	public String search() {
     	
		return "emp-search";

	}

	@PostMapping(value="/search")// SEARCH EMPLOYEE RESULTS PAGE
	public String searchEmployee(Employee employee ,Model model) {
		List<Employee> emp = employeeService.findByEmployeeName(employee.getEmployeeName());
		model.addAttribute("employee", emp);  
		return "searchresults";
	}
}