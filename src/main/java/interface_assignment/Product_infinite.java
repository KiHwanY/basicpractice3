package interface_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product_infinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.println("제품 정보를 입력하세요.");
        while (true) {
            Product p1 = new Product();
            p1.infinite();
            list.add(p1);
            System.out.println("계속 진행을 원하시면 1 , 종료를 원하시면 0을 입력하세요.");
            if (sc.next().equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


        }
        System.out.println("=============================================");
        System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t부가가치세");
        System.out.println("----------------------------------------------");
        for (Product p : list) {

            System.out.println(p.getProid() + "\t" + p.getProname() + "\t" + p.getPropress()
                    + "\t" + p.getPrice() + "\t" + p.getAmount() + "\t" + p.getMoney() + "\t" + p.getProtax());

        }
        System.out.println("=============================================");
    }
}