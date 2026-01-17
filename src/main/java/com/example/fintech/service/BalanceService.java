package com.example.fintech.service;
import com.example.fintech.dto.BalanceResponse;
import com.example.fintech.entity.AccountBalance;import com.example.fintech.repository.AccountBalanceRepository;import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class BalanceService {
    private final AccountBalanceRepository repository;

    public BalanceService(AccountBalanceRepository repository) {
        this.repository = repository;
    }

    public AccountBalance getBalance() {
        return repository.findAll()
                .stream()
                .findFirst()
                .orElseGet(() -> repository.save(
                        new AccountBalance(
                                new BigDecimal("7500000.00"),
                                "IDR",
                                LocalDateTime.now()
                        )
                ));
    }
}
