package br.com.santander.internet_banking_api.domain.conta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;

public record DadosConta(
        @NotNull
        @Pattern(regexp = "\\d{6}")
        String numero_da_conta,
        @NotNull
        Boolean plano_exclusive,
        @NotNull
        BigDecimal saldo
) {
}
