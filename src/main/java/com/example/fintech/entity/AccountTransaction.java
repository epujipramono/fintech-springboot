package com.example.fintech.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class AccountTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private AccountTransactionType type;

    private LocalDateTime createdAt;

    public AccountTransaction() {}

    public AccountTransaction(String accountNumber, BigDecimal amount, AccountTransactionType type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public AccountTransactionType getType() {
        return type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}