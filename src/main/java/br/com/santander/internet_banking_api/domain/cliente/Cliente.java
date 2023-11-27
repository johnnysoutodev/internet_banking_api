package br.com.santander.internet_banking_api.domain.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

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
    private String data_de_nascimento;
    private String numero_da_conta;
    private Boolean plano_exclusive;
    private BigDecimal saldo;
    private Boolean ativo;

    public Cliente(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.data_de_nascimento = dados.data_de_nascimento();
        this.numero_da_conta = dados.numero_da_conta();
        this.plano_exclusive = dados.plano_exclusive();
        this.saldo = dados.saldo();
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.data_de_nascimento() != null){
            this.data_de_nascimento = dados.data_de_nascimento();
        }
        if (dados.numero_da_conta() != null){
            this.numero_da_conta = dados.numero_da_conta();
        }
        if (dados.plano_exclusive() != null){
            this.plano_exclusive = dados.plano_exclusive();
        }
        if (dados.saldo() != null){
            this.saldo = dados.saldo();
        }
    }

    public void excluir() {
        this.ativo = false;
    }

}
