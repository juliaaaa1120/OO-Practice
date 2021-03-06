package Practice;

public class Car extends Vehicle {
    public String name;
    public int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return 30;
    }

    public String getMessage() {
        return this.getName() + ": speed up " + this.getSpeed() + " km/h";
    }
}
