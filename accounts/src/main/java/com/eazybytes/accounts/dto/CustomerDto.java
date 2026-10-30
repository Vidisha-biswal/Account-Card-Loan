package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data 
@Schema(
    name="Customer",
    description="Customer details"
)
public class CustomerDto {
    @Schema(
        description="Name of the customer", example="Vidisha Biswal"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size (min = 4, max = 30, message = "Name must be between 4 and 30 characters")
    private String name;
    @Schema(
        description="Email of the customer", example="vidisha.biswal@example.com"
    )
    @NotEmpty(message = "Email cannot be empty")
    @Email (message = "Email should be valid")
    private String email;
    @Schema(
        description="Mobile number of the customer", example="9876543210"
    )
    @NotEmpty(message = "Mobile number cannot be empty")
    @Pattern (regexp = "(^$|[0-9]{10})", message = "Mobile number must be a 10-digit number") //^\\d{10}$ or [0-9]{10}$
    private String mobileNumber;
    private AccountsDto accountsDto;
}