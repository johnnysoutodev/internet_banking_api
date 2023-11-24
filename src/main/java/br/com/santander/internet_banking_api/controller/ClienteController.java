package br.com.santander.internet_banking_api.controller;

import br.com.santander.internet_banking_api.cliente.Cliente;
import br.com.santander.internet_banking_api.cliente.ClienteRepository;
import br.com.santander.internet_banking_api.cliente.DadosCadastroCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroCliente dados){
        repository.save(new Cliente(dados));
    }
}
