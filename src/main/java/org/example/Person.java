package org.example;

public class Person<T> { // extends Object
    private T person;
    public void set(T person) {
        this.person = person;
    }
    public String getName() {
        return this.person.toString();
    }

    public static void main(String[] args) {

        Man m = new Man("Man");
        Student stu = new Student(100 , "Hong");

        Person<Man> p = new Person<>();
        p.set(m);
        System.out.println("m= "+ m.getName());

        Person<Student> sp = new Person<>();
        sp.set(stu); // 이자리에 Man을 주면 에러가 남
        System.out.println("sp= "+sp.getName());


    }

}


