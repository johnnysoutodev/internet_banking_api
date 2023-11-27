package br.com.santander.internet_banking_api.domain.cliente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.util.Date;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
        Date data_de_nascimento,
        @NotBlank
        @Pattern(regexp = "\\d{6}")
        String numero_da_conta,
        @NotNull
        Boolean plano_exclusive,
        @NotNull
        BigDecimal saldo
) {
}
