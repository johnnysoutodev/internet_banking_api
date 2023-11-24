package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.Conta;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @Embedded
    Conta conta;
    @NotNull
    private Boolean ativo;

    public Cliente(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.data_de_nascimento = dados.data_de_nascimento();
        this.conta = new Conta(dados.conta());
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.data_de_nascimento() != null){
            this.data_de_nascimento = dados.data_de_nascimento();
        }
        if (dados.conta() != null){
            this.conta.atualizaInformacoes(dados.conta());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
