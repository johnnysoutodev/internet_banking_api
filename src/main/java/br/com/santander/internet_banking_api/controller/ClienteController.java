package br.com.santander.internet_banking_api.controller;

import br.com.santander.internet_banking_api.domain.cliente.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cliente")
@Tag(name = "Cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @Operation(
            description = "Endpoint do tipo POST para cadastrar cliente.",
            summary = "Cadastrar cliente."
    )
    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        repository.save(new Cliente(dados));
    }

    @GetMapping
    public Page<DadosListagemCliente> listar(@PageableDefault(size = 10, page = 0, sort = {"id"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemCliente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoCliente dados){
        var cliente = repository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var cliente = repository.getReferenceById(id);
        cliente.excluir();
    }
}
