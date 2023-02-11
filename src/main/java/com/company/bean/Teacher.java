package com.company.bean;

import lombok.Data;

@Data
public class Teacher extends Person {
    private String schoolName;
    private double salary;

    private Student[] students;

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Surname: " + this.getSurname();
    }
}
