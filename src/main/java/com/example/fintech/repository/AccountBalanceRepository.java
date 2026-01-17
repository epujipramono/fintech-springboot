package com.example.fintech.repository;

import com.example.fintech.entity.AccountBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AccountBalanceRepository
        extends JpaRepository<AccountBalance, Long> {

    Optional<AccountBalance> findByAccountNumber(String accountNumber);
}