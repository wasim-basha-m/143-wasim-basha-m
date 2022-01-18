package com.howtodoinjava.demo.controller;
//http://localhost:8080/springmvcexample/employee-module-1/getAllEmployees
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
@RequestMapping("/test")
public class MySample 
{
	
	@RequestMapping(value = "/testHello", method = RequestMethod.GET)
	public String learnmvc(Model model)
	{
		model.addAttribute("NAME","jayanta k");
		model.addAttribute("SIR_NAME","das");
		return "Mysample";
	}
}