package com.example.firstproj.service;

import com.example.firstproj.model.User;
import com.example.firstproj.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository repository;

    @Autowired
    public UserServiceImpl(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public String deleteUserById(Integer id) {
        repository.deleteById(id);
        return "The user with the id: " + id + " has been deleted!";
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
