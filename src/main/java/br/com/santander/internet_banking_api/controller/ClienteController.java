package br.com.santander.internet_banking_api.controller;

import br.com.santander.internet_banking_api.cliente.Cliente;
import br.com.santander.internet_banking_api.cliente.ClienteRepository;
import br.com.santander.internet_banking_api.cliente.DadosCadastroCliente;
import br.com.santander.internet_banking_api.cliente.DadosListagemCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        repository.save(new Cliente(dados));
    }

    @GetMapping
    public List<DadosListagemCliente> listar(Pageable paginacao){
        return repository.findAll().stream().map(DadosListagemCliente::new).toList();
    }
}
