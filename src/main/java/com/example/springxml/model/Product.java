package com.example.springxml.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    @Column(columnDefinition = "DOUBLE(20,2)")
    private double price;
    // private double weight;
    @Column(length = 2000)
    private String description;
    private int quantity;
    private String imageName;
}
