package com.teamjava.springapp.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teamjava.springapp.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	@Query("SELECT p FROM Product p ORDER BY p.id DESC")
	public List<Product> getAllProduct();
}
