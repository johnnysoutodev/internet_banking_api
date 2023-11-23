package br.com.santander.internet_banking_api.cliente;

import br.com.santander.internet_banking_api.conta.Conta;
import java.util.Date;

public record DadosCadastroCliente(
        String nome,
        Date dataDeNascimento,
        Conta conta
) {
}
