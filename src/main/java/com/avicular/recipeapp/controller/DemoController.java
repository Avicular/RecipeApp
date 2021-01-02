package com.avicular.recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	// add request mapping for /leaders

	@GetMapping("/moderators")
	public String showLeaders() {
		
		return "moderators";
	}
	
	// add request mapping for /systems
	
	@GetMapping("/admin")
	public String showSystems() {
		
		return "admin";
	}
	
}










