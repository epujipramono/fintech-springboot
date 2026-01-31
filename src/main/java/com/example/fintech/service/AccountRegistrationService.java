package com.example.fintech.service;

import com.example.fintech.dto.request.AccountRegistrationRequest;
import com.example.fintech.dto.response.AccountRegistrationResponse;
import com.example.fintech.entity.AccountBalance;
import com.example.fintech.entity.AccountTransaction;
import com.example.fintech.entity.AccountTransactionType;
import com.example.fintech.repository.AccountBalanceRepository;
import com.example.fintech.repository.AccountTransactionRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class AccountRegistrationService {

    private final AccountTransactionRepository transactionRepository;
    private final AccountBalanceRepository balanceRepository;

    public AccountRegistrationService(
            AccountTransactionRepository transactionRepository,
            AccountBalanceRepository balanceRepository
    ) {
        this.transactionRepository = transactionRepository;
        this.balanceRepository = balanceRepository;
    }

    public AccountRegistrationResponse registerAccount(AccountRegistrationRequest request) {

        AccountBalance balance = new AccountBalance();
        balance.setAccountNumber(request.getAccountNumber());
        balance.setBalance(new BigDecimal("1500000"));
        balance.setCurrency("IDR");
        balance.setLastUpdated(LocalDateTime.now());

        balanceRepository.save(balance);

        transactionRepository.save(
                new AccountTransaction(request.getAccountNumber(), new BigDecimal("1500000"), AccountTransactionType.CREDIT)
        );

        return new AccountRegistrationResponse(
                "SUCCESS",
                "Account registered successfully",
                request.getAccountNumber(),
                new BigDecimal("1500000"),
                "IDR"
        );
    }
}