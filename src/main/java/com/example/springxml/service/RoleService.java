package com.example.springxml.service;

import com.example.springxml.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRole();

    void addRole(Role role);

    void removeRoleById(long id);

    Optional<Role> getRoleById(long id);

    List<Role> getAllRoleByCategoryId(int id);

    List<Role> search(String keyword);
}
