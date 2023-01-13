package interface_assignment;

public class WrapperEx3 {
    public static void main(String[] args) {
        String strs = "Hello 1234";


        System.out.println("(Chracter 사용)");
        for (int i = 0; i < strs.length(); i++) {
            if (Character.isUpperCase(strs.charAt(i))) {
                System.out.println(strs.charAt(i) + "는 대문자입니다.");
            } else if (Character.isLowerCase(strs.charAt(i))) {
                System.out.println(strs.charAt(i) + " 소문자입니다.");
            } else if (Character.isDigit(strs.charAt(i))) {
                System.out.println(strs.charAt(i) + " 숫자입니다.");
            }
        }
            String clone = "1234";
            System.out.println("==================================");
            System.out.println("(Integer 사용)");
            System.out.println("문자 " + strs.substring(6) + " 입니다.");
            int st = Integer.parseInt(strs.substring(6));
            if (clone.equals(st)) {
                System.out.println("숫자 " + st + "가 아닙니다.");
            } else {
                System.out.println("숫자 " + st + " 입니다.");
            }
            System.out.println("숫자 " + strs.substring(6) + " + 2 = " + (st + 2) + " 입니다.");
        }
    }

