package com.example.fintech.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public class CreateTransactionRequest {

    @NotBlank(message = "Account number is required")
    private String accountNumber;

    @NotNull
    @Positive
    private BigDecimal amount;

    @NotNull
    private String type; // CREDIT / DEBIT

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}