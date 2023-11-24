package br.com.santander.internet_banking_api.conta;

import java.math.BigDecimal;

public record DadosConta(
        String numero_da_conta,
        Boolean plano_exclusive,
        BigDecimal saldo
) {
}
