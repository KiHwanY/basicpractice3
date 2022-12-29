package interface_assignment;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String[] menuArr = new String[3];
        menuArr[0] = "(1) 한식";
        menuArr[1] = "(2) 양식";
        menuArr[2] = "(3) 중식";

        String[] kFoodArr = new String[4];
        kFoodArr[0] = "(1) 김치찌개";
        kFoodArr[1] = "(2) 된장찌개";
        kFoodArr[2] = "(3) 삼겹살";
        kFoodArr[3] = "(4) 비빔밥";

        String[] eFoodArr = new String[3];
        eFoodArr[0] = "(1) 돈까스";
        eFoodArr[1] = "(2) 비프스테이크";
        eFoodArr[2] = "(3) 카레라이스";

        String[] cFoodArr = new String[3];
        cFoodArr[0] = "(1) 짜장면";
        cFoodArr[1] = "(2) 짬뽕";
        cFoodArr[2] = "(3) 탕수육";

        Scanner sc = new Scanner(System.in);
        System.out.println("== [ 메뉴 ] ==");


        int n;
        while (true) {
            for (String s : menuArr) {
                System.out.println(s);

            }
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

            n = sc.nextInt();
            if (n == 0) break;
            if (n == 1) {
                System.out.println("[ 한식메뉴 ] ");
                for (String k : kFoodArr) {
                    System.out.println(k);
                }
                System.out.print("한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>");
                n = sc.nextInt();
                if (n == 0) continue;
                if (n == 99) break;
                System.out.println("고객님은 " + kFoodArr[n - 1] + "를 선택하셨습니다");

            } else if (n == 2) {
                System.out.println("[ 양식메뉴 ]");
                for (String e : eFoodArr) {
                    System.out.println(e);
                }

                System.out.print("양식메뉴를 선택하세요.(양식메뉴선택종료:0, 전체종료:99)>");
                n = sc.nextInt();
                if (n == 0) continue;
                if (n == 99) break;
                System.out.println("고객님은 " + eFoodArr[n - 1] + "를 선택하셨습니다");
            } else {
                System.out.println("[ 중식메뉴 ] ");
                for (String c : cFoodArr) {
                    System.out.println(c);
                }
                System.out.print("중식메뉴를 선택하세요.(중식메뉴선택종료:0, 전체종료:99)>");
                n = sc.nextInt();
                if (n == 0) continue;
                if (n == 99) break;
                System.out.println("고객님은 " + cFoodArr[n - 1] + "를 선택하셨습니다");
            }

        }
        System.out.println();
        if (n == 0) {
            System.out.println("프로그램을 종료합니다.");
        }

        if (n ==99){
            System.out.println("프로그램을 모두 종료합니다.");


        }

    }
}



