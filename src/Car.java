import java.sql.SQLOutput;

public class Car {

    private String make;
    private String model;
    private int year;
    private int mileage;
    private int price;
    private String color;
    private int topSpeed;
    private int currentSpeed;

    private int accelerationConstant = 25;

    // Constructor
    Car(String make, String model, int year, int mileage, int price, String color, int topSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;

    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int newMileage) {
        mileage = newMileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int newTopSpeed) {
        topSpeed = newTopSpeed;
    }

    public void accelerate() {
        if ((currentSpeed + accelerationConstant) > topSpeed) {
            currentSpeed = topSpeed;
            System.out.print("You have reached max speed.");
        } else {
            currentSpeed = currentSpeed + accelerationConstant;
            System.out.println("Accelerating!");
            System.out.println("Speed is now " + currentSpeed);
        }
    }

    public void decelerate() {
        currentSpeed = currentSpeed - accelerationConstant;
        System.out.println("Decelerating");
        System.out.println("Speed is now: " + currentSpeed);
    }

    public void brake() {
        currentSpeed = 0;
        System.out.println("you braked!");
    }

}