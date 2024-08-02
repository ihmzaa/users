package com.example.firstproj.controller;

import com.example.firstproj.model.User;
import com.example.firstproj.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UsersRepository repository;

    @Autowired
    public UserController(UsersRepository usersRepository) {
        this.repository = usersRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Integer id) {
        repository.deleteById(id);
        return "The user with the id: " + id + " has been deleted!";
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return repository.save(user);
    }

    @PostMapping("/list")
    public List<User> createUsers(@RequestBody List<User> user){
        return repository.saveAll(user);
    }
}
