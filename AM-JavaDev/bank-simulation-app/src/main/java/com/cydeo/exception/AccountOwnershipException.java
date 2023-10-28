package com.cydeo.exception;

/**
 * @author ghalipm on 9/16/2023
 * @project bank-simulation-app
 */
public class AccountOwnershipException extends RuntimeException {
    public AccountOwnershipException(String message) {
        super(message);
    }
}
