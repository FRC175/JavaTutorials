package dealership;

public class MotorVehicle {

    private String powerSource; // Gas or battery
    private String color;
    private String name;
    private int year;
    private int topSpeed;
    private int currentSpeed;
    private boolean engineState; // Is it on or off
    private int accelerationConstant = 10;

    public MotorVehicle(String powerSource, String color, String name, int year, int topSpeed) {
        this.powerSource = powerSource;
        this.color = color;
        this.name = name;
        this.year = year;
        this.topSpeed = topSpeed;
        currentSpeed = 0;
        engineState = false;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void accelerate() {
        currentSpeed +
    }

}
