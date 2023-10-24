package br.com.praticando.api.services;

import br.com.praticando.api.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Integer id);
}
