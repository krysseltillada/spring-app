package com.teamjava.springapp.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class SMSServiceImpl implements SMSService
{

    private static final String URL  = "https://sms-test.bayadcenter.net/sms/push";

    @Override
    public String sendMessage(String message, String number)
    {
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("message", message);
        map.add("number", number);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, null);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(URL, request, String.class);

        return response.getBody();
    }
}
