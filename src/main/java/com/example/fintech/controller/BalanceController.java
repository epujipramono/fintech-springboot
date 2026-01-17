package com.example.fintech.controller;

import com.example.fintech.dto.BalanceResponse;
import com.example.fintech.service.BalanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class BalanceController {

    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    @GetMapping("/balance")
    public BalanceResponse getBalance() {
        return balanceService.getBalance();
    }
}