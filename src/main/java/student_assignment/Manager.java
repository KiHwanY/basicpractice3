package student_assignment;

public class Manager extends Employee {

    int income;
    double bonus;

    public void total() {
        this.income = salary * 10;
        this.bonus = income * 0.3;
    }

    public void input(String name, String adress, String email, int salary) {
        getNum();
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.salary = salary;
        getRrn();

    }

    public void print() {
        System.out.println("==================================");
        System.out.println("사번 : " + getNum());
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + adress);
        System.out.println("이메일 : " + email);
        System.out.println("주민번호 : " + getRrn());
        System.out.println("연봉 : " + income);
        System.out.println("보너스 : " + String.format("%.1f", bonus));
        System.out.println("==================================");
    }
}


