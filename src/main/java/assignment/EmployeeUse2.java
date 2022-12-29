package assignment;

public class EmployeeUse2 {

    private String name;
    private String part;//부서
    private String position;//직위
    private int basic;//기본급
    private int bonus;//보너스(기본급의 300%)
    private int total; //총액(기본급+보너스)
    private int tax; //세액(총액의 3.3%)
    private int salary;//실수령액(총액-세액)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeUse2() {
        this("김철수", "관리부", "과장", 300);
    }

    public EmployeeUse2(String name, String part, String position, int basic) {
        this.name = name;
        this.part = part;
        this.position = position;
        this.basic = basic;
    }

    public void Calc() {
        bonus = basic * 3;
        total = basic + bonus;
        tax = (int) ((total) * 0.033);
        salary = total - tax;
    }

    public void print() {
        System.out.println("=========================================");
        System.out.println("이름\t부서\t직위\t기본급 보너스 총액  세액\t실수령액");
        System.out.println(name + " " + part + " " + position + " " + basic + " " + bonus + " " + total + "\t" + tax + "\t" + salary);
        System.out.println("=========================================");

    }
}
