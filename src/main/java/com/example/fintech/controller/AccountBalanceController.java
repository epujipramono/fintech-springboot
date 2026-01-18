package com.example.fintech.controller;

import com.example.fintech.dto.request.AccountBalanceRequest;
import com.example.fintech.dto.response.AccountBalanceResponse;
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

    @PostMapping("/inquiry")
    public AccountBalanceResponse inquiryBalance(
            @Valid @RequestBody AccountBalanceRequest request
    ) {
        return service.getBalanceByAccountNumber(request.getAccountNumber());
    }
}