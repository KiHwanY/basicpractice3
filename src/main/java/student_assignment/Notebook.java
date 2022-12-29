package student_assignment;

public class Notebook implements Controllable{
    @Override
    public void turnOn() {
        System.out.println("노트북을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("노트북을 끈다.");

    }

    @Override
    public void repair() {
        System.out.println("장비를 수리한다..");

    }

    @Override
    public void reset() {
        System.out.println("장비를 초기화한다.");

    }

    public static void main(String[] args) {
        Controllable note = new Notebook();
        note.turnOn();
        note.turnOff();
        note.repair();
        note.reset();

    }
}
