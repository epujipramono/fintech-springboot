package com.example.fintech.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AccountBalanceResponse {
    private String accountNumber;
    private BigDecimal balance;
    private String currency;
    private LocalDateTime lastUpdated;

    public AccountBalanceResponse(String accountNumber, BigDecimal balance, String currency, LocalDateTime lastUpdated) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.lastUpdated = lastUpdated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }
}
