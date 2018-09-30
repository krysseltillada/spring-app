package com.teamjava.springapp.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class User
{


    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
