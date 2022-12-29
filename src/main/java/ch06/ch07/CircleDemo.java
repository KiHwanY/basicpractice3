package ch06.ch07;

class Circle{

    //멤버 변수
    double radius;

    //멤버 메소드
    double findArea(){
        return 3.14 * radius * radius; // 3.14 * 10. * 10.0
    }
    void show(double x, double y){
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n",x,y);
    }
}


public class CircleDemo {
    public static void main(String[] args) {
        Circle myCirclle = new Circle();
        myCirclle.radius = 10.0;
        myCirclle.show(myCirclle.radius,myCirclle.findArea()); //10.0,

    }
}
