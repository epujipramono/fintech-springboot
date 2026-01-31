package com.example.fintech.controller;

import com.example.fintech.dto.request.CreateTransactionRequest;
import com.example.fintech.dto.response.AccountTransactionResponse;
import com.example.fintech.service.AccountTransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class AccountTransactionController {

    private final AccountTransactionService service;

    public AccountTransactionController(AccountTransactionService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccountTransactionResponse create(@Valid @RequestBody CreateTransactionRequest request) {
        return service.createTransaction(request);
    }
}