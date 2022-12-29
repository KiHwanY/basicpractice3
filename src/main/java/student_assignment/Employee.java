package student_assignment;

public class Employee {
    private int num;
    public String name;
    String adress;
    String email;
    protected int salary;
    private String rrn;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;

    }

    public void input(int num, String name, String adress, String email, int salary, String rrn) {
        this.num = num;
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.salary = salary;
        this.rrn = rrn;
    }
}
