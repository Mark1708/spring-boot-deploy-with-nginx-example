package com.example.springbootapp;

import com.example.springbootapp.person.NotFoundException;
import com.example.springbootapp.person.Person;
import com.example.springbootapp.person.PersonRepository;
import com.example.springbootapp.person.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.springbootapp.PersonServiceTestUtil.PERSON_1;
import static com.example.springbootapp.PersonServiceTestUtil.PERSON_2;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonServiceTests {

    @Mock
    private PersonRepository repo;

    private PersonService service;

    private List<Person> persons;


    @BeforeEach
    public void init() {
        service = new PersonService(repo);
        PersonServiceTestUtil.initData();
        persons = new ArrayList<>();
        persons.add(PERSON_1);
        persons.add(PERSON_2);
        repo.saveAll(persons);
    }

    @Test
    public void findAllPersonsTest() {
        Mockito.when(repo.findAll()).thenReturn(persons);
        List<Person> result = service.getAllPerson();
        assertEquals(2, result.size());
        assertTrue(result.contains(PERSON_1));
        assertTrue(result.contains(PERSON_2));
    }

    @Test
    public void findPersonByIdTest() {
        Mockito.when(repo.findPersonById(1L)).thenReturn(Optional.of(PERSON_1));
        assertEquals(PERSON_1, service.getPerson(1L));
    }

    @Test
    public void findPersonByIdExceptionTest() {
        Mockito.when(repo.findPersonById(2L)).thenReturn(Optional.empty());
        assertThrows(NotFoundException.class, () -> service.getPerson(2L));
    }


}
