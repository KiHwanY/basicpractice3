package ch06.ch07;
//한개의 파일에 2개이상의 class를 작성할 때는 PhoneDemo가 있는 public class를 클래스이름으로 저장해야함.
//다른 파일은 접근제어지정자가 default로 처리되어야 함.
class Phone{
    String model;
    int value;
    void print(){
        System.out.println(value + "만원 짜리 "+ model + "스마트폰");
    }
}



public class PhoneDemo {//실행파일
    public static void main(String[] args) {
        Phone myphone = new Phone();//객체생성
        myphone.model = "갤럭시 S11";
        myphone.value = 100;
        myphone.print();


        Phone yourphone = new Phone();//객체생성
        yourphone.model = "iPhone13";
        yourphone.value = 150;
        yourphone.print();



    }
}
