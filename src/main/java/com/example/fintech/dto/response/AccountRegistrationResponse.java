package com.example.fintech.dto.response;

import java.math.BigDecimal;

public class AccountRegistrationResponse {

    private String status;
    private String message;
    private String accountNumber;
    private BigDecimal balance;
    private String currency;

    public AccountRegistrationResponse() {
    }

    public AccountRegistrationResponse(String status, String message, String accountNumber, BigDecimal balance, String currency) {
        this.status = status;
        this.message = message;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
