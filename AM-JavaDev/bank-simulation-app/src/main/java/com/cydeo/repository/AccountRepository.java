package com.cydeo.repository;

import com.cydeo.model.Account;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author ghalipm on 9/9/2023
 * @project bank-simulation-app
 */
@Component
public class AccountRepository {

    public static List<Account> accountList = new ArrayList<>();

    public Account save(Account account){
        accountList.add(account);
        return account;
    }

    public List<Account> findAll() {
        return accountList;
    }

    @SneakyThrows
    public Account findById(UUID id) {
        //TASK
        //complete the method, that find the account inside the list, if not
        //throw RecordNotFoundException
        return accountList.stream().filter(account -> account.getId().equals(id))
                .findAny().orElseThrow(()-> new RecordNotFoundException("Account does not exist in the database."));

    }
}