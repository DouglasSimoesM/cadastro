package projeto.cadastros.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import projeto.cadastros.cadastro.repository.UserRepositoy;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    private UserRepositoy userRepositoy;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepositoy.findByLogin(username);
    }
}
