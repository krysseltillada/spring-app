package com.teamjava.springapp;

import com.teamjava.springapp.api.BillersService;
import com.teamjava.springapp.api.BillersServiceImpl;
import com.teamjava.springapp.api.PaymentGatewayService;
import com.teamjava.springapp.api.PaymentGatewayServiceImpl;
import com.teamjava.springapp.api.SMSService;
import com.teamjava.springapp.api.SMSServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

public class APITest
{

    private SMSService mSMSService = new SMSServiceImpl();
    private BillersService mBillersService = new BillersServiceImpl();
    private PaymentGatewayService mPaymentGatewayService = new PaymentGatewayServiceImpl();

    @Test
    public void testSMS() {
        System.out.println(mSMSService.sendMessage("sample test", "09675281187"));
    }

    @Test
    public void testBillersGetListOfBillers() {
        System.out.println(mBillersService.getListOfBillers("MERALCO", "UTILITIES"));
    }

    @Test
    public void testBillersGetSpecificBillersByCode() {
        System.out.println(mBillersService.getSpecificBillerByCode("BC_ME"));
    }

    @Test
    public void testPGICreateTransaction() {
        System.out.println(mPaymentGatewayService.createTransaction(new BigDecimal("100.00"), "123456", "http://172.22.103.136:8080/receiveKioskTransaction", "kryssel"));
    }

}
