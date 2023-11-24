package br.com.santander.internet_banking_api.conta;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;

@Embeddable
public class Conta {
    private String numero_da_conta;
    private Boolean plano_exclusive;
    private BigDecimal saldo;
}
