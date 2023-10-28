package com.cydeo.exception;

/**
 * @author ghalipm on 9/16/2023
 * @project bank-simulation-app
 */
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
