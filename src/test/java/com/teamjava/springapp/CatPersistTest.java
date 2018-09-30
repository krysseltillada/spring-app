package com.teamjava.springapp;

import com.teamjava.springapp.domain.Cat;
import com.teamjava.springapp.admin.repository.CatRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CatPersistTest
{

    @Autowired
    private CatRepository catRepository;

    @After
    public void clearUp() {
        catRepository.deleteAll();
    }

    @Test
    public void addCatTest() {

        // given one cat
        Cat cat = new Cat();
        cat.setName("miming");

        // when cat adds to the db
        catRepository.save(cat);

        // then check if cat is persist
        assertTrue(catRepository.count() > 0);

    }

}
