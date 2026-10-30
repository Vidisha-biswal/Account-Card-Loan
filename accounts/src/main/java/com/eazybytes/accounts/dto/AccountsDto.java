package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data  
@Schema (
    name="Accounts",
    description="Account details"
)
public class AccountsDto {
    @Schema (
        description="Account number of the customer", example="1234567890"
    )
    @NotEmpty (message = "Account number cannot be empty")
    @Pattern (regexp = "(^$|[0-9]{10})", message = "Account number must be a 10-digit number") 
    private Long accountNumber;
    @Schema (
        description="Type of the account", example="Savings"
    )
    @NotEmpty (message = "Account type cannot be empty")
    private String accountType;
    @Schema (
        description="Branch address of the customer", example="123 Main Street"
    )
    @NotEmpty (message = "Branch address cannot be empty")
    private String branchAddress;
}
