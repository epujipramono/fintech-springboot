package com.example.fintech.repository;
import com.example.fintech.entity.AccountBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountBalanceRepository
        extends JpaRepository<AccountBalance, Long> {
}