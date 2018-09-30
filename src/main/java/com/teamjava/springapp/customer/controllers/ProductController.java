package com.teamjava.springapp.customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamjava.springapp.admin.repository.ProductRepository;
import com.teamjava.springapp.domain.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository  productRepository;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getAllChangelog(){
		return  productRepository.getAllProduct();
	}
}
