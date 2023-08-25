package com.example.springxml.bo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonReponsitory extends JpaRepository<Person, Long> {
}
