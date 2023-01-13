package ch15;

public class Test {
    public static void myException() throws Exception{
        throw new Exception();
    }
    public static void main(String[] args) {
        try {
         myException();

        } catch (Exception e){
        e.printStackTrace();
            System.out.println("예외가 발생하였습니다.");
        }

    }
}
