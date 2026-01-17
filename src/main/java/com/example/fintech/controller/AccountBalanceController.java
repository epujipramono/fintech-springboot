package com.example.fintech.controller;

import com.example.fintech.dto.AccountBalanceRequest;
import com.example.fintech.dto.AccountBalanceResponse;
import com.example.fintech.entity.AccountBalance;
import com.example.fintech.service.AccountBalanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
public class AccountBalanceController {

    private final AccountBalanceService service;

    public AccountBalanceController(AccountBalanceService service) {
        this.service = service;
    }

    @GetMapping("/balance/init")
    public AccountBalance initBalance() {
        return service.getBalance();
    }

    @PostMapping("/inquiry")
    public AccountBalanceResponse inquiryBalance(
            @Valid @RequestBody AccountBalanceRequest request
    ) {
        return service.getBalanceByAccountNumber(request.getAccountNumber());
    }
}