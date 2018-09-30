package com.teamjava.springapp.api;

import org.springframework.stereotype.Service;

@Service
public interface SMSService
{
    String sendMessage(String message, String number);
}
