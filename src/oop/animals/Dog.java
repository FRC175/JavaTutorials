package oop.animals;

public class Dog extends Animal {

    String furColor;

    // Constructor
    // no return type
    // same name as the class
    Dog() {
        // What we change from superclass (Animal)
        food = "meat";
    }

    @Override
    void makeNoise() {
        System.out.println("Bark! Bark!");
    }

    @Override
    String description() {
        return "The dog's name is " + name + ". The dog's breed is " + breed
                + ". The dog's age is " + age + ". The dog is " + size +
                " inches tall. The dog's fur color is " + furColor + ".";
    }

}
