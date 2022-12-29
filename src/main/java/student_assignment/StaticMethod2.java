package student_assignment;

public class StaticMethod2 {

    static int num=10; //사번

    static String name="홍길동";

    String email="hong@gmail.com";

    String hp="010-1234-5678";

    String addr="서울 강남구 역삼동";

    public static void printA(){
        StaticMethod2 pa = new StaticMethod2();

        System.out.println("==========print A()==========");
        System.out.println("사변 : "+ num);
        System.out.println("이름 "+ name);
        System.out.println("이메일 "+ pa.email);
        System.out.println("전화 "+ pa.hp);
        System.out.println("주소 "+ pa.addr);
    }
    public void printB(){

        System.out.println("==========print B()==========");
        System.out.println("사변 : "+ num);
        System.out.println("이름 "+ name);
        System.out.println("이메일 "+email);
        System.out.println("전화 "+ hp);
        System.out.println("주소 "+ addr);

    }

    public static void main(String[] args) {
        printA();
        StaticMethod2 pb = new StaticMethod2();
        pb.printB();
        System.out.println("=============================");


    }
}
