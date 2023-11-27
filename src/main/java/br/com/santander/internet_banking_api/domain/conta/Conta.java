package br.com.santander.internet_banking_api.domain.conta;

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
    private String numero_da_conta;
    private Boolean plano_exclusive;
    private BigDecimal saldo;

    public Conta(DadosConta dados) {
        this.numero_da_conta = dados.numero_da_conta();
        this.plano_exclusive = dados.plano_exclusive();
        this.saldo = dados.saldo();
    }

    public void atualizaInformacoes(DadosConta dados) {
        if (dados.numero_da_conta() != null) {
            this.numero_da_conta = dados.numero_da_conta();
        }
        if (dados.plano_exclusive() != null) {
            this.plano_exclusive = dados.plano_exclusive();
        }
        if (dados.saldo() != null) {
            this.saldo = dados.saldo();
        }
    }
}
