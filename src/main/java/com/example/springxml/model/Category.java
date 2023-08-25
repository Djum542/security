package com.example.springxml.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}
