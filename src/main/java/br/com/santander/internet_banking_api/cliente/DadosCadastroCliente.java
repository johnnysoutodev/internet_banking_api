package br.com.santander.internet_banking_api.cliente;

import java.math.BigDecimal;

public record DadosCadastroCliente(
        String nome,
        String data_de_nascimento,
        String numero_da_conta,
        Boolean plano_exclusive,
        BigDecimal saldo
) {
}
