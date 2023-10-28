package com.cydeo.service;

import com.cydeo.model.Account;
import com.cydeo.model.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author ghalipm on 9/16/2023
 * @project bank-simulation-app
 */
public interface TransactionService {

    Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount, Date creationDate, String message);

    List<Transaction> findAllTransactions();

    List<Transaction> last10Transactions();

    List<Transaction> findTransactionListById(UUID id);
}