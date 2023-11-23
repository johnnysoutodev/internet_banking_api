package br.com.santander.internet_banking_api.controller;


import br.com.santander.internet_banking_api.cliente.DadosCadastroCliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados){

    }
}
