package com.example.fintech.controller;

import com.example.fintech.dto.request.AccountRegistrationRequest;
import com.example.fintech.service.AccountRegistrationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class AccountRegistrationController {

    private final AccountRegistrationService service;

    public AccountRegistrationController(AccountRegistrationService service) {
        this.service = service;
    }

    @PostMapping
    public void registerAccount(@Valid @RequestBody AccountRegistrationRequest request) {
        service.registerAccount(request);
    }
}