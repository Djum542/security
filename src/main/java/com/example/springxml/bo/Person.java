package com.example.springxml.bo;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.Data;
    @Data
    @Entity
    @Table(name = "person")
    public class Person {
        @Id
        @GeneratedValue
        private String name;
        private int age;
    }