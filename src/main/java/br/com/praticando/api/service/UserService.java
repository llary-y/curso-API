package br.com.praticando.api.service;

import br.com.praticando.api.domain.User;
import br.com.praticando.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll ();
    User create (UserDTO obj);

}
