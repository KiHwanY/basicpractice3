package interface_assignment;

public class MemberOuter {
    static class Inner {
        int id = 1;
        String name = "홍길동";
        String email = "hong@gmail.com";

        public void print() {
            System.out.println("---------------------------");
            System.out.println("고객번호 : " + id);
            System.out.println("이름 : " + name);
            System.out.println("이메일 : " + email);
            System.out.println("---------------------------");
        }
    }
    public static void main(String[] args) {
        MemberOuter.Inner in = new MemberOuter.Inner();
        in.print();
    }
}
