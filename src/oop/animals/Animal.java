package oop.animals;

public class Animal {

    int size;
    String type;
    String name;
    String typeOfFood;

    void sleep() {
        System.out.println("Zzz...");
    }

    void eat() {
        System.out.println("I love eating " + typeOfFood + "!");
    }

    void makeNoise() {
        System.out.println("Noise!!!");
    }

    void sit() {
        System.out.println(name + " is now sitting.");
    }

    String description() {
        return name + " is a(n) " + type + " who is " + size + " inches.";
    }

}
