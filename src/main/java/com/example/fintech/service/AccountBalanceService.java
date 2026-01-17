package com.example.fintech.service;

import com.example.fintech.dto.response.AccountBalanceResponse;
import com.example.fintech.entity.AccountBalance;
import com.example.fintech.mapper.AccountBalanceMapper;import com.example.fintech.repository.AccountBalanceRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class AccountBalanceService {

    private final AccountBalanceRepository repository;

    public AccountBalanceService(AccountBalanceRepository repository) {
        this.repository = repository;
    }

    public AccountBalance initBalance() {
        AccountBalance balance = new AccountBalance();
        balance.setAccountNumber("123456789");
        balance.setBalance(new BigDecimal("1500000"));
        balance.setCurrency("IDR");
        balance.setLastUpdated(LocalDateTime.now());

        return repository.save(balance);
    }

    public AccountBalanceResponse getBalanceByAccountNumber(String accountNumber) {
        AccountBalance balance = repository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        return AccountBalanceMapper.toResponse(balance);
    }
}
