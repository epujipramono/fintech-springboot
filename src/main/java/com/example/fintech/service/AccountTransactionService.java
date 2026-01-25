package com.example.fintech.service;

import com.example.fintech.dto.request.CreateTransactionRequest;
import com.example.fintech.entity.AccountBalance;
import com.example.fintech.entity.AccountTransaction;
import com.example.fintech.exception.AccountNotFoundException;
import com.example.fintech.repository.AccountBalanceRepository;
import com.example.fintech.repository.AccountTransactionRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class AccountTransactionService {

    private final AccountTransactionRepository transactionRepository;
    private final AccountBalanceRepository balanceRepository;

    public AccountTransactionService(
            AccountTransactionRepository transactionRepository,
            AccountBalanceRepository balanceRepository
    ) {
        this.transactionRepository = transactionRepository;
        this.balanceRepository = balanceRepository;
    }

    public void createTransaction(CreateTransactionRequest request) {

        AccountBalance balance = balanceRepository.findByAccountNumber(request.getAccountNumber())
                .orElseThrow(AccountNotFoundException::new);

        BigDecimal newBalance;

        if ("CREDIT".equalsIgnoreCase(request.getType().toString())) {
            newBalance = balance.getBalance().add(request.getAmount());
        } else if ("DEBIT".equalsIgnoreCase(request.getType().toString())) {
            newBalance = balance.getBalance().subtract(request.getAmount());
        } else {
            throw new IllegalArgumentException("Invalid transaction type");
        }

        balance.setBalance(newBalance);

        transactionRepository.save(
                new AccountTransaction(request.getAccountNumber(), request.getAmount(), request.getType())
        );

        balanceRepository.save(balance);
    }
}