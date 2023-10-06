package com.cydeo.service;

import com.cydeo.model.Account;
import com.cydeo.model.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author ghalipm on 9/16/2023
 * @project bank-simulation-app
 */
public interface TransactionService {

    Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount, Date creationDate, String message);

    List<Transaction> findAllTransaction();
}