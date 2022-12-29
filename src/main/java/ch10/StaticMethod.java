package ch10;

public class StaticMethod {
    static int a =10;
    int b=20;

    public static void printA(){//static method
        System.out.println(a);
        StaticMethod s = new StaticMethod();
        System.out.println(s.b);
    }
    public void printB(){
        System.out.println(a);//non-static method
        System.out.println(b);
    }
    public static void main(String[] args) {
        printA();
        StaticMethod a =new StaticMethod();
        System.out.println("=============================");
        a.printB();
        System.out.println("=============================");

    }
}
