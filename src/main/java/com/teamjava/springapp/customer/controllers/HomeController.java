package com.teamjava.springapp.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.teamjava.springapp.admin.repository.ProductRepository;

@Controller
public class HomeController {
	
	@Autowired
	private ProductRepository  productRepository;
	
	@GetMapping("/customer/home")
    public String index(Model model) {
		model.addAttribute("products",productRepository.getAllProduct());
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
