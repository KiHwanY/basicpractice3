package org.example;

import java.util.Objects;

public class Student implements Cloneable {


    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

    // if ( s1 != null && s1.equals(s2) )
    @Override           // 아래 Object는 다형성
    public boolean equals(Object o) {
        // 동일한 메모리 주소면 true
        if (this == o)
            return true;
        // this는 절대 null이 될 수 없으므로 o가 null이면 false!!
        // 동일한 class Type이 아니면 false
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student clobj = (Student) super.clone();
        clobj.name = clobj.name + "복제본!";
        return clobj;
        //clone()메서드를 사용할 때 발생할 수 있는 오류를 예외 처리한다.
    }



    public static void main(String[] args) throws CloneNotSupportedException  {

        Student s = new Student(100, "홍길동");
//        Student s2 = (Student) s.clone();
//        //clone()메서드를 사용해 s인스턴스를 s2에 복제한다.
//        System.out.println(s2);

        Student s1 = new Student(123, "Hong");
        Student s2 = new Student(456, "Kim");
        Student s3 = new Student(123, "Hong");
        System.out.println("s1 equals s2 =" + s2.equals(s1)); // false!!
        System.out.println("s1 equals s3 =" + s3.equals(s1)); // true!!

//        String s1 = new String("123abc");
//        String s2 = "123abc";
//        String s3 = "123abc";

//        System.out.println(s1 == s2 + ", " + s1.equals(s2));
//        System.out.println(s3 == s2);
//        System.out.println(System.identityHashCode(s1) + ", " + System.identityHashCode(s2));
//        System.out.println(s1.hashCode() + " : " + s2.hashCode() + " : " + s3.hashCode());




    }
}
