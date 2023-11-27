package br.com.santander.internet_banking_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Johnny Souto",
                        email = "johnny.souto@cagpgemini.com ",
                        url = "https://www.capgemini.com.br"
                ),
                description = "API do teste para desenvolvedor Back-End do Santander",
                title = "Santander Banking API",
                version = "1.0.0",
                license = @License(
                        name = "License Name",
                        url = "https://www.licensesite.com"
                ),
                termsOfService = "Terms of service"
        )
)
public class OpenApiConfig {
}
