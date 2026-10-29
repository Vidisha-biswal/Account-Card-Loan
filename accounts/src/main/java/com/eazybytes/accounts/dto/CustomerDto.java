package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data 
public class CustomerDto {
    @NotEmpty(message = "Name cannot be empty")
    @Size (min = 4, max = 30, message = "Name must be between 4 and 30 characters")
    private String name;
    @NotEmpty(message = "Email cannot be empty")
    @Email (message = "Email should be valid")
    private String email;
    @NotEmpty(message = "Mobile number cannot be empty")
    @Pattern (regexp = "(^$|[0-9]{10})", message = "Mobile number must be a 10-digit number") //^\\d{10}$ or [0-9]{10}$
    private String mobileNumber;
    private AccountsDto accountsDto;
}