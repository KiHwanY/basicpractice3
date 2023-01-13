package ch13;

public class Exam {
    public static void main(String[] args) {
        String a="hello";// String pool 영역에 저장
        System.out.println(System.identityHashCode(a));
        String b ="hello";
        System.out.println(System.identityHashCode(b));
        System.out.println(a==b);//주소값이 같은가?


        String c= new String("hello"); // 정상 => Heap메모리 영역에 저장
        System.out.println(System.identityHashCode(c));
        String d= new String("hello");
        System.out.println(System.identityHashCode(d));
        System.out.println(c==d);//주소값이 같은가?
        System.out.println(c.equals(d));//내용은 같은가?


    }
}
