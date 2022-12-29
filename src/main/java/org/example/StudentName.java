package org.example;

public class StudentName {
    private Student person;
    public void set(Student person) {
        this.person = person;
    }
    public String getName() {
        return this.person.toString();
    }
}

