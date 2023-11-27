package br.com.santander.internet_banking_api.domain.cliente;

import br.com.santander.internet_banking_api.domain.conta.DadosConta;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String data_de_nascimento,
        DadosConta conta
) {
}
