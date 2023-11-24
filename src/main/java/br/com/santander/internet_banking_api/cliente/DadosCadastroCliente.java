package br.com.santander.internet_banking_api.cliente;

import java.math.BigDecimal;

public record DadosCadastroCliente(
        String nome,
        String dataDeNascimento,
        int numeroDaConta,
        Boolean planoExclusive,
        BigDecimal saldo
) {
}
