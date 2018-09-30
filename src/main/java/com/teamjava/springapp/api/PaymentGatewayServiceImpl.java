package com.teamjava.springapp.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

public class PaymentGatewayServiceImpl implements PaymentGatewayService
{

    private static final String URL = "https://pgi-api-test.bayadcenter.net/";

    @Override
    public String createTransaction(BigDecimal amount, String transactionId, String callbackURL, String name)
    {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("X-MultiPay-Token", "9ed98c02548aefad00eee6e87ea5bf2cc2c2cd9a");
        headers.add("X-MultiPay-Code", "COC");

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

        map.add("amount", amount.toPlainString());
        map.add("txnid", transactionId);
        map.add("callback_url", callbackURL);

        if (name != null && !name.isEmpty()) {
            map.add("name", name);
        }

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(URL + "api/v1/transactions/generate", request , String.class );
        return response.getBody();
    }

    @Override
    public String updateRealTimePaymentNotification(String callbackURL, String transactionId, String referenceNo, String status,
                                                     String processorId)
    {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("X-MultiPay-Token", "9ed98c02548aefad00eee6e87ea5bf2cc2c2cd9a");
        headers.add("X-MultiPay-Code", "COC");

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

        map.add("txnid", transactionId);
        map.add("refno", referenceNo);
        map.add("status", status);
        map.add("procid", processorId);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(callbackURL, request , String.class );
        return response.getBody();

    }
}
