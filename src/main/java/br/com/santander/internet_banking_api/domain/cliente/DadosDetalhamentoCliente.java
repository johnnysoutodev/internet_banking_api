package br.com.santander.internet_banking_api.domain.cliente;


import java.math.BigDecimal;

public record DadosDetalhamentoCliente(
        Long id,
        String nome,
        String data_de_nascimento,
        String numero_da_conta,
        Boolean plano_exclusive,
        BigDecimal saldo) {

    public DadosDetalhamentoCliente(Cliente cliente){
        this(
                cliente.getId(),
                cliente.getNome(),
                cliente.getData_de_nascimento(),
                cliente.getNumero_da_conta(),
                cliente.getPlano_exclusive(),
                cliente.getSaldo()
        );
    }
}
