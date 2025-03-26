package projeto.cadastros.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;
import projeto.cadastros.cadastro.repository.CadastroSimplificadoRepository;

import java.util.List;

@Service
public class CadastroSimplificadoService {

    @Autowired
    private CadastroSimplificadoRepository cadastroSimplificadoRepository;

    @Transactional(readOnly = true)
    public List<CadastroSimplificado> findAll() {
        List<CadastroSimplificado> cadastroSimplificados = cadastroSimplificadoRepository.findAll();
        var verificar = cadastroSimplificados.stream()
                .map((CadastroSimplificado::new))
                .toList();

        if (verificar == null || verificar.isEmpty()){
            throw new RuntimeException("Nenhum registro encontrado");
        }

        return verificar;
    }


}
