package com.teamjava.springapp.admin.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("AdminLoginController")
public class LoginController {
	@GetMapping("/admin")
	public String getLoginPage(Principal principal) {
		return principal == null ? "admin/login" : "redirect:/admin/dashboard";
	}
}
