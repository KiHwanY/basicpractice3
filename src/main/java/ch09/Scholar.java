package ch09;

public class Scholar extends Student{//장학생은 학생이다. is a 관계
    //is a 관계일때는 부모멤버들을 그대로 쓸 수 있다.
    private String category;//장학금 종류
    private int money;//장학금액
    public void input(String name, String num, String major,
                      int year, String category,int money){
        super.input(name,num,major,year);//부모쪽 input메소드 호출
        this.category = category;
        this.money = money;
        // super() => 부모클래스의 생성자 호출, 주의점 : 첫째줄에서 정의
        // super. => 부모클래스의 변수,메소드 호출
        // this() => 현재 클래스의 다른 생성자 호출
        // this. => 현재 클래스의 변수 , 메소드 호출
    }
    public void print(){
        System.out.println("이름\t 학번 전공 학년 구분 장학금액");
        System.out.println(name+" "+num+" "+major+" "+
                year+" "+category+" "+money);
    }
    public void print2(){
        System.out.println("이름\t 학번 전공 학년");
        System.out.println(name+" "+num+" "+major+" "+
                year);
    }

}
