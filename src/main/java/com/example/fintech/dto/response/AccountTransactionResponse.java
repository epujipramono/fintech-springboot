package com.example.fintech.dto.response;

import com.example.fintech.entity.AccountTransactionType;
import java.math.BigDecimal;

public class AccountTransactionResponse {

    private String status;
    private String message;
    private String accountNumber;
    private BigDecimal amount;
    private AccountTransactionType type;
    private BigDecimal balance;

    public AccountTransactionResponse() {
    }

    public AccountTransactionResponse(String status, String message, String accountNumber, BigDecimal amount, AccountTransactionType type,  BigDecimal balance) {
        this.status = status;
        this.message = message;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.balance = balance;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public AccountTransactionType getType() {
        return type;
    }

    public void setType(AccountTransactionType type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
