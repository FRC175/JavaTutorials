package oop.animals;

public class Animal {

    private String name;
    private String breed;
    private String food;
    private int age;
    private int size;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String newFood) {
        food = newFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }
    // Method
    // returnType nameOfMethod(param...)
    // Ex: String description()
    // Ex: void doNothing(int a, int b)
    public void run() {
        System.out.println(name + " is running!");
    }

    public void eat() {
        System.out.println(name + " is eating " + food + "!");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }

    public void makeNoise() {
        System.out.println("Noise!");
    }

    public void doTricks() {
        System.out.println(name + " rolled over!");
    }

    public String description() {
        return "The animal's name is " + name + ". The animal's breed is " + breed
                + ". The animal's age is " + age + ". The animal is " + size + " inches tall.";
    }

}
