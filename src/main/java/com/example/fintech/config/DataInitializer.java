package com.example.fintech.config;

import com.example.fintech.entity.AccountBalance;
import com.example.fintech.repository.AccountBalanceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(AccountBalanceRepository repository) {
        return args -> {

            if (repository.count() == 0) {
                AccountBalance balance = new AccountBalance();
                balance.setAccountNumber("123456789");
                balance.setBalance(new BigDecimal("1500000"));
                balance.setCurrency("IDR");
                balance.setLastUpdated(LocalDateTime.now());

                repository.save(balance);
            }
        };
    }
}