package com.teamjava.springapp.api;

import java.math.BigDecimal;

public interface PaymentGatewayService
{
    String createTransaction(BigDecimal amount, String transactionId, String callbackURL, String name);
    String updateRealTimePaymentNotification(String callbackURL, String transactionId, String referenceNo, String status, String processorId);
}
