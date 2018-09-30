package com.teamjava.springapp.admin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teamjava.springapp.domain.Cat;
import com.teamjava.springapp.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
