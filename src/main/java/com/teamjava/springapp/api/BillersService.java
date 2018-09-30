package com.teamjava.springapp.api;

public interface BillersService
{
    String getListOfBillers(String name, String category);
    String getSpecificBillerByCode(String code);

}
