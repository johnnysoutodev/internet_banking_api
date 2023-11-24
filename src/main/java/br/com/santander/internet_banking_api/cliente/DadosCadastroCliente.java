package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.DadosConta;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        String data_de_nascimento,
        @NotNull @Valid DadosConta conta
) {
}
