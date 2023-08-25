package com.example.springxml.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    PersonReponsitory personReponsitory;
    @PostMapping(value = "/person", produces = MediaType.APPLICATION_XML_VALUE)
//    public List getPerson() {
//        List lis = new ArrayList<>();
//        Person person = new Person();
//        person.setName("John");
//        person.setAge(30);
//        Book book = new Book();
//        book.setId(1);
//        book.setTitle("nhan trang xml");
//        book.setAuthor("258888887");
//        book.setPublication_year(2022);
//        lis.add(person);
//        lis.add(book);
//        return lis;
//    }
    public Person la(){
        Person person = new Person();
        person.setName("Hai");
        person.setName("Dang");
        person.setName("Trieu");
        person.setAge(20);
        person.setAge(25);
        person.setAge(22);
        return person;
    }
}

