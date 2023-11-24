package br.com.santander.internet_banking_api.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataDeNascimento;
    private String numeroDaConta;
    private Boolean planoExclusive;
    private BigDecimal saldo;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.numeroDaConta = dados.numeroDaConta();
        this.planoExclusive = dados.planoExclusive();
        this.saldo = dados.saldo();
    }
}
