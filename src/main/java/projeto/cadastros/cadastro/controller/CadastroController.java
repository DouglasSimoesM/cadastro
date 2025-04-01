package projeto.cadastros.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
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

    @PutMapping("/{cpf}")
    public ResponseEntity<Cadastro> atualizar(@PathVariable String cpf, @RequestBody Cadastro cadastro){
        Cadastro atualizado = cadastroService.atualizarCadastros(cpf, cadastro);
        return ResponseEntity.ok(atualizado);
    }

}
