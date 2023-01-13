package interface_assignment;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Product p1 = new Product();
        p1.input();
        Product p2 = new Product();
        p2.input();

        list.add(p1);
        list.add(p2);
        System.out.println("=============================================");
        System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)");
        System.out.println("----------------------------------------------");
        for (Product p : list) {

            System.out.println(p.getProid() + "\t" + p.getProname() + "\t" + p.getPropress()
                    + "\t" + p.getPrice() + "\t" + p.getAmount() + "\t" + p.getMoney());

        }
        System.out.println("=============================================");

        System.out.println();





    }
}
