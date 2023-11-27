package br.com.santander.internet_banking_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

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
                        name = "License Apache 2.0",
                        url = "https://www.santander.com.br/license"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local DEV",
                        url = "http://localhost:8080"
                )
        }
)
public class OpenApiConfig {
}
