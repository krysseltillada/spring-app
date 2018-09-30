package com.teamjava.springapp.customer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/customer/home")
    public String index() {
        return "/customer/index";
    }
	
	
	@GetMapping("/customer/about")
	public String about() {
		return "/customer/about";
	}
	
	@GetMapping("/customer/contact")
	public String contact() {
		return "/customer/contact";
	}
	
	@GetMapping("/customer/login")
	public String login() {
		return "/customer/login";
	}
	
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
}
