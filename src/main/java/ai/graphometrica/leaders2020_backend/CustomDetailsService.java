package ai.graphometrica.leaders2020_backend;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomDetailsService implements UserDetailsService {

    private final UserRepository repository;

    public CustomDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public CustomUser loadUserByUsername(final String username) throws UsernameNotFoundException {
        var userEntity = repository.findByLogin(username);
        if(userEntity.isEmpty()) {
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        return new CustomUser(userEntity.get());
    }
}
