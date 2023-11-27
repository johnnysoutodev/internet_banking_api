package br.com.santander.internet_banking_api.controller;

import br.com.santander.internet_banking_api.domain.cliente.*;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cliente")
@Tag(name = "Cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @Operation(
            description = "Endpoint do tipo POST para cadastrar cliente.",
            summary = "Cadastrar cliente.",
            responses ={
                    @ApiResponse(
                            description = "Criado.",
                            responseCode = "201"
                    )
            }
    )
    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        repository.save(new Cliente(dados));
    }

    @Operation(
            description = "Endpoint do tipo GET para listar todos os clientes.",
            summary = "Lista todos os clientes."
    )
    @GetMapping("/listarTodos")
    public Page<DadosDetalhamentoCliente> listar(@PageableDefault(size = 10, page = 0, sort = {"id"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosDetalhamentoCliente::new);
    }

    @Operation(
            description = "Endpoint do tipo PUT para atualizar o cliente",
            summary = "Atualiza o cliente."
    )
    @PutMapping("/atualizar")
    @Transactional
//    @Hidden
    public void atualizar(@RequestBody @Valid DadosAtualizacaoCliente dados){
        var cliente = repository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);
    }

    @Operation(
            description = "Endpoint do tipo DELETE para excluir o cliente.",
            summary = "Excluir cliente."
    )
    @DeleteMapping("/excluir/{id}")
    @Transactional
//    @Hidden
    public void excluir(@PathVariable Long id){
        var cliente = repository.getReferenceById(id);
        cliente.excluir();
    }

    @Operation(
            description = "Endpoint do tipo GET para detalhar um cliente.",
            summary = "Detalhar cliente."
    )
    @GetMapping("/detalhar/{id}")
    public List<DadosDetalhamentoCliente> detalhar(@PathVariable Long id) {
        return repository.findById(id).stream().map(DadosDetalhamentoCliente::new).toList();
    }
}
