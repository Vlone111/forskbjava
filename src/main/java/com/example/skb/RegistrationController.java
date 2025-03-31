package com.example.skb;

import jakarta.validation.Valid;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
public class RegistrationController {

    private final MessageSource messageSource;

    // Добавим сообщение об успешной валидации
    private static final String VALIDATION_SUCCESS_KEY = "validation.success";

    public RegistrationController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @PostMapping("/register")
    public ResponseEntity<?> validateRegistration(
            @Valid @RequestBody RegistrationRequest request,
            BindingResult bindingResult,
            Locale locale) {

        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), messageSource.getMessage(error, locale));
            }
            return ResponseEntity.badRequest().body(errors);
        }

        // Возвращаем только результат валидации
        String successMessage = messageSource.getMessage(
                VALIDATION_SUCCESS_KEY,
                null,
                "Validation passed", // дефолтное сообщение
                locale
        );

        return ResponseEntity.ok().body(Map.of("message", successMessage));
    }
}