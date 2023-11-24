package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.Conta;

public record DadosListagemCliente(
        String nome,
        String data_de_nascimento
) {
    public DadosListagemCliente(Cliente cliente){
        this(cliente.getNome(), cliente.getData_de_nascimento());
    }
}
