package interface_assignment;

public class Slnfo implements Student {
    private String name, address, email;
    private int kor, eng, mat;

    private int tot;
    private double avg;


    Slnfo(String name, String eamil) {
        this.name = name;
        this.email = eamil;
    }


    @Override
    public void address(String address) {
        this.address = address;
    }

    @Override
    public void point(int kor, int eng, int mat) {
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }


    public void print() {
        tot = kor + eng + mat;
        avg = tot /3.0;
        System.out.println("==============================");
        System.out.println("이름\t  주소\t     이메일");
        System.out.println(name + " " + address + " " + email);
        System.out.println("------------------------------");
        System.out.println("이름\t국어 영어 수학 총점 평균");
        System.out.println(name + " " + kor + " " + eng + " " + mat + " " + tot + " " + String.format("%.1f", avg));
        System.out.println("==============================");

    }
}


