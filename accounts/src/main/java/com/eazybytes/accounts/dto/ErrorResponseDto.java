package com.eazybytes.accounts.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema (
    name="ErrorResponse",
    description="Error response details"
)
@Data @AllArgsConstructor 
public class ErrorResponseDto {
    @Schema (
        description="API path where the error occurred"
    )
    private String apiPath;
    @Schema (
        description="HTTP status code of the error"
    )
    private HttpStatus errorCode;
    @Schema (
        description="Error message"
    )
    private String errorMessage;
    @Schema (
        description="Time when the error occurred"
    )
    private LocalDateTime errorTime;
}
