package ch11;

public class MyCalculatorExam {
    public static void main(String[] args) {
        Calculator ca1 = new MyCalculator();
        int value1 = ca1.multiple(5,10);
        int value2 = ca1.plus(5,10);
        int value3 = ca1.exec(5,10);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
