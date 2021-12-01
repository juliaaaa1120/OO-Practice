package Practice;

public class Car extends Vehicle {
    public String name;
    public int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return 30;
    }

    public String getMessage() {
        return "Car: speed up " + this.getSpeed() + " km/h";
    }
}
