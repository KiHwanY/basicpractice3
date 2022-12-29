package assignment;

public class Person {
    public static void main(String[] args) {
        PersonUse2 per = new PersonUse2();
        per.setName("홍길동");
        per.setAge(30);
        per.setEmail("hong@naver.com");
        per.setAddress("서울 강남구 역삼동");
        per.print();


        PersonUse2 per2 = new PersonUse2();
        per2.setName("사임당");
        per2.setAge(25);
        per2.setEmail("saimdang@gmail.com");
        per2.setAddress("서울 강남구 개포동");
        per2.print();


    }
}
