package com.teamjava.springapp.repository;

import com.teamjava.springapp.domain.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> { }
