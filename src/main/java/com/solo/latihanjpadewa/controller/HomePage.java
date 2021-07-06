package com.solo.latihanjpadewa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
	@GetMapping("/")
	public String viewIndex() {
		return "index.html";
	}
	
	@GetMapping("/destination") 
	public String viewDestination(){
		return "destination.html";
	}
	
	@GetMapping("/pricing") 
	public String viewPricing(){
		return "pricing.html";
	}
	
	@GetMapping("/contact") 
	public String viewContact(){
		return "contact.html";
	}
	
	
}
