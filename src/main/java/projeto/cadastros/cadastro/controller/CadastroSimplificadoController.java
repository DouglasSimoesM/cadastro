package projeto.cadastros.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;
import projeto.cadastros.cadastro.service.CadastroSimplificadoService;

import java.util.List;

@RestController
@RequestMapping("/simples")
public class CadastroSimplificadoController {

    @Autowired
    private CadastroSimplificadoService cadastroSimplificadoService;

    @GetMapping
    public ResponseEntity<List<CadastroSimplificado>> findAll() {
        List<CadastroSimplificado> resultado = cadastroSimplificadoService.findAll();
        return ResponseEntity.ok(resultado);
    }
}
