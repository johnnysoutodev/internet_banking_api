package br.com.santander.internet_banking_api.domain.cliente;

import br.com.santander.internet_banking_api.domain.conta.DadosConta;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
        String data_de_nascimento,
        @NotNull @Valid DadosConta conta
) {
}
