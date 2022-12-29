package student_assignment;

class Pa3{
    String email="hong@gmail.com";
    String hp="010-1234-5678";
    String addr="서울 강남구 역삼동";


    public void print(){
        System.out.println("이메일 "+email);
        System.out.println("전화 "+ hp);
        System.out.println("주소 "+ addr);
    }
}
class Ch3 extends Pa3{
    String email="hong@gmail.com";
    String hp="010-1234-5678";
    String addr="서울 강남구 역삼동";

    static String name="홍길동";
    static int num=10; //사번

    @Override
    public void print() {

        System.out.println("사변 : "+ num);
        System.out.println("이름 "+ name);
        super.print();
    }
}

public class Poly3 {
    public static void main(String[] args) {
        Pa3 ch = new Ch3();
        System.out.println("=============================");
        ch.print();
        System.out.println("=============================");

    }
}
