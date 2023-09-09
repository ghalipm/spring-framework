package com.cydeo.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * @author ghalipm on 9/9/2023
 * @project bank-simulation-app
 */
@Data
@Builder
public class Transaction {
    private UUID sender;
    private UUID receiver;
    private BigDecimal amount;
    private String message;
    private Date createDate;
}
