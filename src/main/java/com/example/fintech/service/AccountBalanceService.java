package com.example.fintech.service;

import com.example.fintech.dto.response.AccountBalanceResponse;
import com.example.fintech.entity.AccountBalance;
import com.example.fintech.exception.AccountNotFoundException;
import com.example.fintech.mapper.AccountBalanceMapper;
import com.example.fintech.repository.AccountBalanceRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountBalanceService {

    private final AccountBalanceRepository repository;

    public AccountBalanceService(AccountBalanceRepository repository) {
        this.repository = repository;
    }

    public AccountBalanceResponse getBalanceByAccountNumber(String accountNumber) {
        AccountBalance balance = repository.findByAccountNumber(accountNumber)
                .orElseThrow(AccountNotFoundException::new);

        return AccountBalanceMapper.toResponse(balance);
    }
}
