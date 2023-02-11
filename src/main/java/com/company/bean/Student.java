package com.company.bean;


import lombok.Data;
@Data
public class Student extends Person {

    private String schoolName;
    private double scholarship;

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Surname: " + this.getSurname();
    }
}