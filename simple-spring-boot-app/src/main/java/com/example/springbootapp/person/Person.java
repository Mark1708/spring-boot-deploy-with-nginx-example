package com.example.springbootapp.person;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
}
