package oop.animals;

public class Dog {

    int size;
    String type;
    String name;

    void sleep() {
        System.out.println("Zzz...");
    }

    void eat() {
        System.out.println("I love eating meat!");
    }

    void makeNoise() {
        System.out.println("Ruff! Ruff!");
    }

    void sit() {
        System.out.println(name + " is now sitting.");
    }

    void roll() {
        System.out.println(name + " rolled over!");
    }

    String description() {
        return name + " is a " + type + " that is " + size + " inches.";
    }

}
