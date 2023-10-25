package br.com.praticando.api.service.impl;

import br.com.praticando.api.domain.User;
import br.com.praticando.api.domain.dto.UserDTO;
import br.com.praticando.api.repositories.UserRepository;
import br.com.praticando.api.service.UserService;
import br.com.praticando.api.service.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object não encontrado!"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User create (UserDTO obj) {
        return repository.save(mapper.map(obj, User.class));
    }


}
