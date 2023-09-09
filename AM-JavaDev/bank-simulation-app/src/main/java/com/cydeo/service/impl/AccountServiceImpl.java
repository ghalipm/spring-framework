package com.cydeo.service.impl;

import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;
import com.cydeo.repository.AccountRepository;
import com.cydeo.service.AccountService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static com.cydeo.model.Account.*;

/**
 * @author ghalipm on 9/9/2023
 * @project bank-simulation-app
 */
@Component
public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public Account createNewAccount(BigDecimal balance, Date createDate, AccountType accountType, Long userId) {
        // create Account object
        Account account=Account.builder().id(UUID.randomUUID()).userId(userId).balance(balance).accountType(accountType).creationDate(createDate).build();
        // save the object into DB

        //return the object
        return null;
    }

    @Override
    public List<Account> listAllAccount() {
        return null;
    }
}
