package com.example.springbootapp.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PersonService {

    private final PersonRepository repo;

    @Autowired
    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public List<Person> getAllPerson() {
        return repo.findAll();
    }

    public Person getPerson(Long id) {
        return repo.findPersonById(id)
                .orElseThrow(() -> new NotFoundException("Not found element(s) by id " + id));
    }
}
