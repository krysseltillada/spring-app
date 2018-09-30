package com.teamjava.springapp.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamjava.springapp.admin.repository.ProductRepository;
import com.teamjava.springapp.domain.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

}
