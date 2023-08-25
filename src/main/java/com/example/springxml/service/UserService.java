package com.example.springxml.service;

import com.example.springxml.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    void addUser(User user);

    void removeUserById(long id);

    Optional<User> getUserById(long id);

    List<User> getAllUsersByCategoryId(long id);

    List<User> search(String keyword);
}
