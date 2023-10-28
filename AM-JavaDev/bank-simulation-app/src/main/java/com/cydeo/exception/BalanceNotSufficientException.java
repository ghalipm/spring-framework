package com.cydeo.exception;

/**
 * @author ghalipm on 9/16/2023
 * @project bank-simulation-app
 */
public class BalanceNotSufficientException extends RuntimeException {
    public BalanceNotSufficientException(String message) {
        super(message);
    }
}
