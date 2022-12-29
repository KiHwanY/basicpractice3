package org.example;

public class ManName {
    private Man person;
    public void set(Man person) {
        this.person = person;
    }
    public String getName() {
        return this.person.toString();
    }
}


