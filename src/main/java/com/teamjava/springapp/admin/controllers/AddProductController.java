package com.teamjava.springapp.admin.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.teamjava.springapp.admin.service.ProductService;
import com.teamjava.springapp.domain.Cat;
import com.teamjava.springapp.domain.Product;

@Controller
public class AddProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/admin/add-product")
	public String getAddProductPage(Model model) {
		model.addAttribute("product", new Product());
		return "admin/add-product";
	}
	
    @PostMapping("/admin/add-product")
    public String postProduct(@Valid
                        @ModelAttribute Product product,
                        BindingResult pBindingResult,
                        Model model) {
        if (pBindingResult.hasErrors()) {
            return "admin/add-product";
        }
        
        productService.saveProduct(product);
        model.addAttribute("success", "Product successfully posted.");

        return "admin/add-product";
    }
}
