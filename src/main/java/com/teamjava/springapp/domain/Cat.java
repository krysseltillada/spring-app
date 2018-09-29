package com.teamjava.springapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Cat
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long catId;

    @NotNull
    @NotEmpty
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String pName)
    {
        name = pName;
    }
}
