package br.com.santander.internet_banking_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Johnny Souto",
                        email = "johnny.souto@cagpgemini.com ",
                        url = "https://www.capgemini.com.br"
                ),
                description = "API do teste para desenvolvedor Back-End do Santander",
                title = "Santander Banking API"
        )
)
public class OpenApiConfig {
}
