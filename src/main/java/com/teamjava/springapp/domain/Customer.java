package com.teamjava.springapp.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer extends User
{

    @OneToMany
    private List<TransactionLog> transactionLog;

    @OneToMany
    private List<PaymentHistory> paymentHistory;

    public List<TransactionLog> getTransactionLog()
    {
        return transactionLog;
    }

    public void setTransactionLog(List<TransactionLog> pTransactionLog)
    {
        transactionLog = pTransactionLog;
    }

    public List<PaymentHistory> getPaymentHistory()
    {
        return paymentHistory;
    }

    public void setPaymentHistory(List<PaymentHistory> pPaymentHistory)
    {
        paymentHistory = pPaymentHistory;
    }
}
