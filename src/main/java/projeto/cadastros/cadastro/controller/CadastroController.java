package projeto.cadastros.cadastro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;
import projeto.cadastros.cadastro.service.CadastroService;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    private final CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @PostMapping
    public ResponseEntity<Cadastro> criarCadastro(@RequestBody Cadastro cadastro) {
        return ResponseEntity.ok(cadastroService.salvarCadastro(cadastro));
    }

    @GetMapping
    public ResponseEntity<List<Cadastro>> findAll() {
        List<Cadastro> resultado = cadastroService.findAll();
        return ResponseEntity.ok(resultado);
    }
}
