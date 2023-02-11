package com.company.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Person implements Serializable {
    private String name;
    private String surname;
    private int age;

    Person() {
    }

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


}
