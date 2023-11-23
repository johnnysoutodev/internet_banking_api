package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.Conta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    @Embedded
    private Conta conta;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.conta = new Conta(dados.conta());
    }
}
