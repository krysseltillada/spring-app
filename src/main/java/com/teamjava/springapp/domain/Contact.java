package com.teamjava.springapp.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Contact
{

    private String email;
    private String contactNo;
    private String address;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String pEmail)
    {
        email = pEmail;
    }

    public String getContactNo()
    {
        return contactNo;
    }

    public void setContactNo(String pContactNo)
    {
        contactNo = pContactNo;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String pAddress)
    {
        address = pAddress;
    }
}
