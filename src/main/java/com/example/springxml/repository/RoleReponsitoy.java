package com.example.springxml.repository;

import com.example.springxml.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleReponsitoy extends JpaRepository<Role,Long> {
}
