package com.example.fintech.exception;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException() {
        super("Insufficient balance");
    }
}