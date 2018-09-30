package com.teamjava.springapp.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.teamjava.springapp.domain.Cat;

public interface CustomerRepository extends CrudRepository<Cat, Long>{
	
}
