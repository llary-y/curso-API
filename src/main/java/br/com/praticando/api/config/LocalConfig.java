package br.com.praticando.api.config;

import br.com.praticando.api.domain.User;
import br.com.praticando.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "kyara", "kyara@dogmail.com", "123");
        User u2 = new User(null, "ayla", "ayla@dogmail.com", "456");

        repository.saveAll(List.of(u1, u2));
    }
}
