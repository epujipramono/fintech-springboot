package com.example.fintech.controller;

import com.example.fintech.dto.request.AccountRegistrationRequest;
import com.example.fintech.dto.response.AccountRegistrationResponse;
import com.example.fintech.service.AccountRegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class AccountRegistrationController {

    private final AccountRegistrationService service;

    public AccountRegistrationController(AccountRegistrationService service) {
        this.service = service;
    }

    @PostMapping
    public AccountRegistrationResponse registerAccount(@Valid @RequestBody AccountRegistrationRequest request) {
        return service.registerAccount(request);
    }
}