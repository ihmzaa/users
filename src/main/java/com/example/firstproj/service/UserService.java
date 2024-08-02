package com.example.firstproj.service;

import com.example.firstproj.model.User;


import java.util.List;
public interface UserService {
    User createUser(User user);
    String deleteUserById(Integer id);
    List<User> getAllUsers();
}
