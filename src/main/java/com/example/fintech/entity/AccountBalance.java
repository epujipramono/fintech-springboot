package com.example.fintech.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "account_balance")
public class AccountBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(nullable = false)
    private String currency;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    protected AccountBalance() {}

    public AccountBalance(
            BigDecimal balance,
            String currency,
            LocalDateTime lastUpdated
    ) {
        this.balance = balance;
        this.currency = currency;
        this.lastUpdated = lastUpdated;
    }

    public Long getId() {
        return id;
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