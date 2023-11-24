package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.DadosConta;

import java.math.BigDecimal;

public record DadosCadastroCliente(
        String nome,
        String data_de_nascimento,
        DadosConta conta
) {
}
