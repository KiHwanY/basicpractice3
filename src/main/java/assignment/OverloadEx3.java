package assignment;

public class OverloadEx3 {

    public static void main(String[] args) {
        print("김과장", 560);

    }

    static void print(String name , int score){
        double tax = score/0.3;
        double amount = tax - score;

        System.out.println("=========================================");
        System.out.println("이름  급여  세금\t실수령액");
        System.out.println(name+" "+score+" "+String.format("%.1f",tax)+"\t"+String.format("%.1f",amount));
        System.out.println("=========================================");



    }
}
