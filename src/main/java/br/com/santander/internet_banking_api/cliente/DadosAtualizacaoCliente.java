package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.DadosConta;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String data_de_nascimento,
        DadosConta conta
) {
}
