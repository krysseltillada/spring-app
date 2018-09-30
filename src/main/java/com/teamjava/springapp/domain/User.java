package com.teamjava.springapp.domain;


import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String username;
    private String password;

    private String authority;

    @Embedded
    private Contact contact;

    private boolean enabled;

    public Long getId()
    {
        return id;
    }

    public void setId(Long pId)
    {
        id = pId;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String pFullName)
    {
        fullName = pFullName;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String pUsername)
    {
        username = pUsername;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String pPassword)
    {
        password = pPassword;
    }

    public String getAuthority()
    {
        return authority;
    }

    public void setAuthority(String pAuthority)
    {
        authority = pAuthority;
    }

    public Contact getContact()
    {
        return contact;
    }

    public void setContact(Contact pContact)
    {
        contact = pContact;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean pEnabled)
    {
        enabled = pEnabled;
    }
}
