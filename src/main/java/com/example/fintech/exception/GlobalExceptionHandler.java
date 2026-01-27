package com.example.fintech.exception;

import com.example.fintech.dto.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleAccountNotFound(AccountNotFoundException ex) {
        return new ErrorResponse(
                "ACCOUNT_NOT_FOUND",
                ex.getMessage()
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidation(MethodArgumentNotValidException ex) {
        return new ErrorResponse(
                "VALIDATION_ERROR",
                ex.getBindingResult()
                        .getFieldError()
                        .getDefaultMessage()
        );
    }

    @ExceptionHandler(InsufficientBalanceException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleInsufficientBalance(InsufficientBalanceException ex) {
        return new ErrorResponse(
                "INSUFFICIENT_BALANCE",
                ex.getMessage()
        );
    }
}