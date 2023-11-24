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
    private String numero_da_conta;
    private Boolean plano_exclusive;
    private BigDecimal saldo;
}
