package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.Conta;
import jakarta.persistence.*;

@Table(name = "clientes")
@Entity(name = "Cliente")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String data_de_nascimento;
    @Embedded
    Conta conta;
}
