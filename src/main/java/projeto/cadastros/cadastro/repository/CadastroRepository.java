package projeto.cadastros.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.cadastros.cadastro.entity.Cadastro;

import java.util.Optional;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    Optional<Cadastro> findByCpf(String cpf);
}
