package com.example.skb;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationRequest {
    @NotBlank(message = "{email.notblank}")
    @Email(message = "{email.invalid}")
    private String email;

    @NotBlank(message = "{password.notblank}")
    @Size(min = 6, max = 20, message = "{password.size}")

    private String password;

}