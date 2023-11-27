package br.com.santander.internet_banking_api.domain.cliente;

public record DadosDetalhamentoCliente(
        Long id,
        String nome,
        String data_de_nascimento) {

    public DadosDetalhamentoCliente(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getData_de_nascimento());
    }
}
