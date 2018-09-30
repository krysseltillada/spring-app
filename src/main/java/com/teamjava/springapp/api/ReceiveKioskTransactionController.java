package com.teamjava.springapp.api;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReceiveKioskTransactionController
{
    @PostMapping("/receiveKioskTransaction")
    public void receiveKioskTransaction(HttpEntity<String> httpEntity) {
        System.out.println("REQUEST HITTTTTT!!!");
        System.out.println(httpEntity.getBody());
    }
}
