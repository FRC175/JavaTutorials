package oop.animals;

public class Elephant {

    int size;
    String type;
    String name;

    void sleep() {
        System.out.println("Zzz...");
    }

    void eat() {
        System.out.println("I love eating plants!");
    }

    void storm() {
        System.out.println("Thump! Thump! Thump!");
    }

    void makeNoise() {
        System.out.println("Baraa!!!");
    }

    void sit() {
        System.out.println(name + " is now sitting.");
    }

    String description() {
        return name + " is " + type + " who is " + size + " inches.";
    }

}
