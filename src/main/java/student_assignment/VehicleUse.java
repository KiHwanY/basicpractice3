package student_assignment;

public class VehicleUse {
    public static void main(String[] args) {
        System.out.println("===========================");
        Vehicle car = new Car();
        car.speedUp();
        car.speedDown();
        car.handling();
        System.out.println("===========================");
        Vehicle plane = new Plane();
        plane.speedUp();
        plane.speedDown();
        plane.handling();
        System.out.println("===========================");
        Vehicle boat = new Boat();
        boat.speedUp();
        boat.speedDown();
        boat.handling();
        System.out.println("===========================");

    }
}
