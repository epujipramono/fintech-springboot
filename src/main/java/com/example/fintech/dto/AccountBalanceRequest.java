package com.example.fintech.dto;

import jakarta.validation.constraints.NotBlank;

public class AccountBalanceRequest {

    @NotBlank(message = "Account number is required")
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
