package projeto.cadastros.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.cadastros.cadastro.entity.Cadastro;

<<<<<<< HEAD
import java.util.Optional;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    Optional<Cadastro> findByCpf(String cpf);
=======
@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
}
