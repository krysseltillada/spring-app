package com.teamjava.springapp.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

public class BillersServiceImpl implements BillersService
{

    private static final String URL = "https://bpf-api-test.bayadcenter.net/biller";

    @Override
    public String getListOfBillers(String name, String category)
    {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL + "?name=" + name + "&category=" + category, String.class);

        return response.getBody();
    }

    @Override
    public String getSpecificBillerByCode(String code)
    {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL + "/" + code, String.class);
        return response.getBody();
    }
}
