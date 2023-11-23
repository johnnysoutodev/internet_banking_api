package br.com.santander.internet_banking_api.conta;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    private String numeroDaConta;
    private Boolean planoExclusive;
    private BigDecimal saldo;

    public Conta(Conta dados) {
        this.numeroDaConta = dados.numeroDaConta;
        this.planoExclusive = dados.planoExclusive;
        this.saldo = dados.saldo;
    }
}
