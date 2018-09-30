package com.teamjava.springapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class PaymentHistory
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentHistoryId;

    private String referenceNumber;
    private BigDecimal amountPaid;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimePaid;

    public Long getPaymentHistoryId()
    {
        return paymentHistoryId;
    }

    public void setPaymentHistoryId(Long pPaymentHistoryId)
    {
        paymentHistoryId = pPaymentHistoryId;
    }

    public String getReferenceNumber()
    {
        return referenceNumber;
    }

    public void setReferenceNumber(String pReferenceNumber)
    {
        referenceNumber = pReferenceNumber;
    }

    public BigDecimal getAmountPaid()
    {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal pAmountPaid)
    {
        amountPaid = pAmountPaid;
    }

    public Date getDateTimePaid()
    {
        return dateTimePaid;
    }

    public void setDateTimePaid(Date pDateTimePaid)
    {
        dateTimePaid = pDateTimePaid;
    }
}
