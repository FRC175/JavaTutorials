package oop.animals;

public class Animal {

    String name;
    String breed;
    String food;
    int age;
    int size;

    // Method
    // returnType nameOfMethod(param...)
    // Ex: String description()
    // Ex: void doNothing(int a, int b)
    void run() {
        System.out.println(name + " is running!");
    }

    void eat() {
        System.out.println(name + " is eating " + food + "!");
    }

    void sleep() {
        System.out.println("Zzz...");
    }

    void makeNoise() {
        System.out.println("Noise!");
    }

    void doTricks() {
        System.out.println(name + " rolled over!");
    }

    String description() {
        return "The animal's name is " + name + ". The animal's breed is " + breed
                + ". The animal's age is " + age + ". The animal is " + size + " inches tall.";
    }

}
