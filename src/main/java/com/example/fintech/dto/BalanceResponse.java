package com.example.fintech.dto;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BalanceResponse {

    private BigDecimal balance;
    private String currency;
    private LocalDateTime lastUpdated;

    public BalanceResponse(BigDecimal balance, String currency, LocalDateTime lastUpdated) {
        this.balance = balance;
        this.currency = currency;
        this.lastUpdated = lastUpdated;
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
