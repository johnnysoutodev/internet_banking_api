package br.com.santander.internet_banking_api.controller;

import br.com.santander.internet_banking_api.cliente.DadosCadastroCliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados){
        System.out.println(dados);
    }
}
