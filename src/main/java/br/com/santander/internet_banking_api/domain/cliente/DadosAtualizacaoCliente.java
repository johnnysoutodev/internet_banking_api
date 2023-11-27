package br.com.santander.internet_banking_api.domain.cliente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.util.Date;

public record DadosAtualizacaoCliente(
        Long id,
        String nome,
        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")
        String data_de_nascimento,
        @Pattern(regexp = "\\d{6}")
        String numero_da_conta,
        Boolean plano_exclusive,
        BigDecimal saldo
) {
}
