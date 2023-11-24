package br.com.santander.internet_banking_api.cliente;

public record DadosListagemCliente(
        String nome,
        String numero_da_conta,
        Boolean plano_exclusive
) {
    public DadosListagemCliente(Cliente cliente){
        this(cliente.getNome(), cliente.getNumero_da_conta(), cliente.getPlano_exclusive());
    }
}
