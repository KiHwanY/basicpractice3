package ch11;

public class CoinDemo {
    public static void main(String[] args) {
        //인터페이스 상수는 static 영역에 있기 때문에 클래스이름.상수이름으로 접근 가능하다.
        System.out.println("Dime은 " + Coin.DIME + "센트 입니다.");
    }
}
