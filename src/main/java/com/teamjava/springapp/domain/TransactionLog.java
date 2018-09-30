package com.teamjava.springapp.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class TransactionLog
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionLogId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeOccured;

    private String description;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    public Long getTransactionLogId()
    {
        return transactionLogId;
    }

    public void setTransactionLogId(Long pTransactionLogId)
    {
        transactionLogId = pTransactionLogId;
    }

    public Date getDateTimeOccured()
    {
        return dateTimeOccured;
    }

    public void setDateTimeOccured(Date pDateTimeOccured)
    {
        dateTimeOccured = pDateTimeOccured;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String pDescription)
    {
        description = pDescription;
    }

    public TransactionType getTransactionType()
    {
        return transactionType;
    }

    public void setTransactionType(TransactionType pTransactionType)
    {
        transactionType = pTransactionType;
    }
}
