package com.cydeo.service;

import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author ghalipm on 9/9/2023
 * @project bank-simulation-app
 */
public interface AccountService {

    Account createNewAccount(BigDecimal balance, Date createDate, AccountType accountType, Long userId);
    List<Account> listAllAccount();

    List<Account> deleteAccount(Account account);

}
