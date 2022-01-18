package com.howtodoinjava.demo.controller;
//http://localhost:8080/springmvcexample/employee-module-1/getAllEmployees
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.dao.CompanyDAO;
import com.howtodoinjava.demo.model.CompanyVO;
import com.howtodoinjava.demo.model.Student;
import com.howtodoinjava.demo.service.CompanyManager;
import com.howtodoinjava.demo.dao.CompanyDAOImpl;

@Controller
@RequestMapping("/Comp")
public class CompanyController {
	
	@Autowired
	CompanyManager companyManager;
	
	@RequestMapping(value = "/getAllCompanyNames", method = RequestMethod.GET)
	public String getAllCompanyName(Model model)
	{
		List<CompanyVO> compList=companyManager.getAllCompanyNames();
		model.addAttribute("companies",compList );
		model.addAttribute("name","WASIM");
		model.addAttribute("title","student");
		return "complist";
	}

	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	   public String addCompany(@ModelAttribute("company")CompanyVO companies, 
	   ModelMap model) {
	     
	      model.addAttribute("id", companies.getId());
	      model.addAttribute("CompName", companies.getCompName());
	      
	      return "complistresults";
	   }
	
}