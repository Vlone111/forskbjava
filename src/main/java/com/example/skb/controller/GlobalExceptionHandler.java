package com.example.skb.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Обработчик исключений, возвращающий 502 ошибку
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        System.out.println("Ошибка: " + ex.getMessage());
        return new ResponseEntity<>("Кастомная ошибка 502: Проблемы с сервером.", HttpStatus.BAD_GATEWAY);
    }
}
