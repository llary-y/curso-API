package br.com.praticando.api.service;

import br.com.praticando.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
