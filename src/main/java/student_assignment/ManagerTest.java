package student_assignment;

public class ManagerTest {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.input(1,"홍길동","서울 강남구 역삼동","hong@gmail.com",300,"123456-1234567");
        m1.total();
        m1.print();
    }


}
