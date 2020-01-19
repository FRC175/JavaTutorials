package oop.animals;

public class Lion extends Animal {

    String furColor;
    String mane;
    String gender;

    // CONSTRUCTOR
    Lion() {
        food = "meat";
    }

    @Override
    void makeNoise() {
        System.out.println("Roar!!!");
    }

    @Override
    void doTricks() {
        System.out.println(name + " jumps.");
    }

    @Override
    String description() {
        return "The lion's name is " + name + ". The lion's breed is " + breed
                + ". The lion's age is " + age + ". The lion is " + size +
                " inches tall. The lion's fur color is " + furColor
                + ". The lion's gender is " + gender + ". The lion's mane is " + mane + ".";
    }

    void chase() {
        System.out.println(name + " is chasing its prey.");
    }

}
