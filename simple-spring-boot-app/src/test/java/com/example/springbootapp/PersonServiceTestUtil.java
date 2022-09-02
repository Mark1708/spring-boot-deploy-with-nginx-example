package com.example.springbootapp;

import com.example.springbootapp.person.Person;

public class PersonServiceTestUtil {

    public static final Person PERSON_1;
    public static final Person PERSON_2;

    static {
        PERSON_1 = new Person();
        PERSON_2 = new Person();
        initData();
    }
    public static void initData() {
        PERSON_1.setId(1L);
        PERSON_1.setName("Mark");
        PERSON_1.setRole("ADMIN");

        PERSON_2.setId(2L);
        PERSON_2.setName("Alex");
        PERSON_2.setRole("MODERATOR");
    }
}
