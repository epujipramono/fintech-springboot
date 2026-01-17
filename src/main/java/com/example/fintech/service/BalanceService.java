package com.example.fintech.service;
import com.example.fintech.dto.BalanceResponse;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class BalanceService {
    public BalanceResponse getBalance() {
        return new BalanceResponse(new BigDecimal("1500000.00"), new String("IDR"), LocalDateTime.now());
    }
}
