package projeto.cadastros.cadastro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;

import java.util.Optional;

@Repository
public interface CadastroSimplificadoRepository extends MongoRepository<CadastroSimplificado, String> {
    Optional<CadastroSimplificado> findByCpf(String cpf);
}
