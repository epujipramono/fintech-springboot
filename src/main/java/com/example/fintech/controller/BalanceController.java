package com.example.fintech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class BalanceController {

    @GetMapping("/balance")
    public BigDecimal getBalance() {
        return new BigDecimal("1500000.00");
    }
}