package com.example.fintech.controller;
import com.example.fintech.dto.BalanceResponse;
import com.example.fintech.entity.AccountBalance;import com.example.fintech.service.BalanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class BalanceController {

    private final BalanceService service;

    public BalanceController(BalanceService service) {
        this.service = service;
    }

    @GetMapping("/balance")
    public BalanceResponse getBalance() {
        AccountBalance entity = service.getBalance();

        return new BalanceResponse(
                entity.getBalance(),
                entity.getCurrency(),
                entity.getLastUpdated()
        );
    }
}