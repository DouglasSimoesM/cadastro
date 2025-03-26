package projeto.cadastros.cadastro.controller;

import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;
import projeto.cadastros.cadastro.service.CadastroService;

import java.util.List;

=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.service.CadastroService;

>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
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
<<<<<<< HEAD

    @GetMapping
    public ResponseEntity<List<Cadastro>> findAll() {
        List<Cadastro> resultado = cadastroService.findAll();
        return ResponseEntity.ok(resultado);
    }
=======
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
}
