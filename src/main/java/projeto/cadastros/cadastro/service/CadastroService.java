package projeto.cadastros.cadastro.service;

<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
=======
import org.springframework.stereotype.Service;
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
import projeto.cadastros.cadastro.entity.Cadastro;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;
import projeto.cadastros.cadastro.repository.CadastroRepository;
import projeto.cadastros.cadastro.repository.CadastroSimplificadoRepository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
@Service
public class CadastroService {
    private final CadastroRepository cadastroRepository;
    private final CadastroSimplificadoRepository cadastroSimplificadoRepository;

    public CadastroService(CadastroRepository cadastroRepository, CadastroSimplificadoRepository cadastroSimplificadoRepository) {
        this.cadastroRepository = cadastroRepository;
        this.cadastroSimplificadoRepository = cadastroSimplificadoRepository;
    }

    public Cadastro salvarCadastro(Cadastro cadastro) {
<<<<<<< HEAD
        var cpfValido = cadastroRepository.findByCpf(cadastro.getCpf());
        if (cpfValido.isPresent()) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "CPF already exists.");
        }

=======
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
        Cadastro saved = cadastroRepository.save(cadastro);

        CadastroSimplificado simplificado = new CadastroSimplificado();
        simplificado.setNome(saved.getNome());
        simplificado.setCpf(saved.getCpf());
        simplificado.setSetor(saved.getSetor());
<<<<<<< HEAD
=======

>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
        cadastroSimplificadoRepository.save(simplificado);

        return saved;
    }
<<<<<<< HEAD

    @Transactional(readOnly = true)
    public List<Cadastro> findAll(){
        List<Cadastro> cadastros = cadastroRepository.findAll();

        if (cadastros == null || cadastros.isEmpty()) {
            throw new RuntimeException("Nenhum registro encontrado");
        }

        return cadastros;
    }

=======
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
}
