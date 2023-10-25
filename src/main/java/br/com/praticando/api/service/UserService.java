package br.com.praticando.api.service;

import br.com.praticando.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll ();

}
