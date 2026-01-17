package com.example.fintech.mapper;

import com.example.fintech.dto.response.AccountBalanceResponse;
import com.example.fintech.entity.AccountBalance;

public class AccountBalanceMapper {

    public static AccountBalanceResponse toResponse(AccountBalance entity) {
        return new AccountBalanceResponse(
                entity.getAccountNumber(),
                entity.getBalance(),
                entity.getCurrency(),
                entity.getLastUpdated()
        );
    }
}