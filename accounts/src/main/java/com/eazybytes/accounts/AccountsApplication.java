package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info = @Info(
		title = "Accounts Microservice API",
		version = "1.0",
		description = "Accounts Microservice API Documentation", 
		contact = @Contact(
			name = "Vidisha Biswal",
			email = "biswalvidisha31@gmail.com",
			url = ""
		),
		license = @License(
			name = "Apache 2.0",
			url = "http://www.apache.org/licenses/LICENSE-2.0"
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "Accounts Microservice API Documentation",
		url = ""
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}