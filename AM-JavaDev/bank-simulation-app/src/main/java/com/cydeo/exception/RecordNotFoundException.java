package com.cydeo.exception;

/**
 * @author ghalipm on 9/16/2023
 * @project bank-simulation-app
 */
public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(String message) {
        super(message);
    }
}
