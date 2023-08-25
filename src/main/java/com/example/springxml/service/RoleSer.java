package com.example.springxml.service;

import com.example.springxml.model.Role;
import com.example.springxml.repository.RoleReponsitoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleSer implements RoleService{
    @Autowired
    RoleReponsitoy roleReponsitoy;
    @Override
    public List<Role> getAllRole() {
        return roleReponsitoy.findAll();
    }

    @Override
    public void addRole(Role role) {
        roleReponsitoy.save(role);
    }

    @Override
    public void removeRoleById(long id) {
        roleReponsitoy.deleteById(id);
    }

    @Override
    public Optional<Role> getRoleById(long id) {
        return roleReponsitoy.findById(id);
    }

    @Override
    public List<Role> getAllRoleByCategoryId(int id) {
        return null;
    }

    @Override
    public List<Role> search(String keyword) {
        return null;
    }
}
