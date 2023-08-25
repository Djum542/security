package com.example.springxml.service;

import com.example.springxml.model.User;
import com.example.springxml.repository.UserReponsitoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserSer implements UserService{
    @Autowired
    UserReponsitoy userReponsitoy;
    @Override
    public List<User> getAllUser() {
        return userReponsitoy.findAll();
    }

    @Override
    public void addUser(User user) {
        userReponsitoy.save(user);
    }

    @Override
    public void removeUserById(long id) {
        userReponsitoy.deleteById(id);
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userReponsitoy.findById(id);
    }

    @Override
    public List<User> getAllUsersByCategoryId(long id) {
        return null;
    }

    @Override
    public List<User> search(String keyword) {
        return null;
    }
}
