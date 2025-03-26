package projeto.cadastros.cadastro.service;

import org.springframework.stereotype.Service;
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;
import projeto.cadastros.cadastro.repository.CadastroRepository;
import projeto.cadastros.cadastro.repository.CadastroSimplificadoRepository;

@Service
public class CadastroService {
    private final CadastroRepository cadastroRepository;
    private final CadastroSimplificadoRepository cadastroSimplificadoRepository;

    public CadastroService(CadastroRepository cadastroRepository, CadastroSimplificadoRepository cadastroSimplificadoRepository) {
        this.cadastroRepository = cadastroRepository;
        this.cadastroSimplificadoRepository = cadastroSimplificadoRepository;
    }

    public Cadastro salvarCadastro(Cadastro cadastro) {
        Cadastro saved = cadastroRepository.save(cadastro);

        CadastroSimplificado simplificado = new CadastroSimplificado();
        simplificado.setNome(saved.getNome());
        simplificado.setCpf(saved.getCpf());
        simplificado.setSetor(saved.getSetor());

        cadastroSimplificadoRepository.save(simplificado);

        return saved;
    }
}
