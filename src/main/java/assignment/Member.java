package assignment;

public class Member {
    private String name;
    private String userid;
    private int money;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getGrade() {
        if (money > 100000){
            grade = "Gold";
        }else {
            grade ="Silver";
        }
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Member(){
        this("김철수","kim",50000);
    }

    public Member(String name, String userid, int money) {
        this.name = name;
        this.userid = userid;
        this.money = money;
    }
    public void print(){
        System.out.println("=============================================");
        System.out.println("이름\t아이디 구매금액 등급");
        System.out.println(name+" "+userid+" "+money+" "+getGrade());
        System.out.println("=============================================");

    }
}
