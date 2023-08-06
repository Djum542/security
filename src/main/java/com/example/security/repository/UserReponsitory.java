package com.example.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.security.model.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserReponsitory extends CrudRepository<User, Integer> {

}