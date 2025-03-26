package projeto.cadastros.cadastro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import projeto.cadastros.cadastro.entity.CadastroSimplificado;

@Repository
public interface CadastroSimplificadoRepository extends MongoRepository<CadastroSimplificado, String> {
}
