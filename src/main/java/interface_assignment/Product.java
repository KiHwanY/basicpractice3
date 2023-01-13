package interface_assignment;

import java.util.Scanner;

public class Product {
    private String proid;
    private String proname;
    private String propress;
    private int price;
    private int amount;
    private int money;

    // 옵션 문제
    private int protax;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("제품번호 : ");
        proid = sc.next();
        System.out.print("제품명 : ");
        proname = sc.next();
        System.out.print("제조사 : ");
        propress = sc.next();
        System.out.print("단가 : ");
        price = sc.nextInt();
        System.out.print("수량 : ");
        amount = sc.nextInt();


        money = price*amount;


    }
    // 옵션 문제
    public void infinite(){
        Scanner sc = new Scanner(System.in);
        System.out.print("제품번호 : ");
        proid = sc.next();
        System.out.print("제품명 : ");
        proname = sc.next();
        System.out.print("제조사 : ");
        propress = sc.next();
        System.out.print("단가 : ");
        price = sc.nextInt();
        System.out.print("수량 : ");
        amount = sc.nextInt();


        money = price*amount;
        protax = (int)((money)*0.1);

    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getPropress() {
        return propress;
    }

    public void setPropress(String propress) {
        this.propress = propress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getProtax() {
        return protax;
    }

    public void setProtax(int protax) {
        this.protax = protax;
    }
}
