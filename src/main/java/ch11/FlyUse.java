package ch11;

public class FlyUse {
    public static void main(String[] args) {
//        Bird b = new Bird();
//        b.takeOff();
//        b.fly();
//        b.land();
//
//        Airplane a = new Airplane();
//        a.takeOff();
//        a.fly();
//        a.land();

        //좌:부, 우:자 => 다형성
        Flyer f = new Bird();
        f.takeOff();
        f.fly();
        f.land();
        f= new Airplane();
        f.takeOff();
        f.fly();
        f.land();

    }
}
