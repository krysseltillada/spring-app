package com.teamjava.springapp.admin.service;

import org.springframework.stereotype.Service;

import com.teamjava.springapp.domain.Product;

@Service
public interface ProductService {
	public void saveProduct(Product product);
}
