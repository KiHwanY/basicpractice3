package interface_assignment;

import ch13.ObjCast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ECUse {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        List<EC> list = new ArrayList<>();

        list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918123468", 55900));
        list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691123445", 23600));
        list.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160123482", 2600000));

        map.put("list", list);

        print(map);
    }

    public static void print(Map<String, Object> map) {
        ArrayList<EC> list2 = (ArrayList<EC>) map.get("list");
        System.out.println("------------------------------------------------");
        System.out.println("주문번호\t주문일자\t주문상품\t카드명\t카드번호\t결제금액");
        System.out.println("------------------------------------------------");
        for (EC str : list2) {
            System.out.println(str.getNo() + "\t" + str.getOrderDate() +
                    "\t" + str.getProduct() + "\t" + str.getCardName() + "\t" + str.getCardNo() + "\t" + str.getPay());
        }
        System.out.println("------------------------------------------------");

        System.out.println();
    }
}
