package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	@GetMapping("/exampleString")
	public String exampleString() {
		return "example";
	}
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		return new ModelAndView("example");
	}
	
}
