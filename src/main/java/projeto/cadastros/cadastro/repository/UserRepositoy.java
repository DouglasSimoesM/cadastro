package projeto.cadastros.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import projeto.cadastros.cadastro.entity.user.User;

@Repository
public interface UserRepositoy extends JpaRepository<User, Long> {
    User findByLogin(String login);
}

