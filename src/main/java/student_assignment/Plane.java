package student_assignment;

public class Plane implements Vehicle{
    @Override
    public void speedUp() {
        System.out.println("Plane SpeedUp");
    }

    @Override
    public void speedDown() {
        System.out.println("Plane SpeedDown");

    }

    @Override
    public void handling() {
        System.out.println("Plane Handling");

    }
}
