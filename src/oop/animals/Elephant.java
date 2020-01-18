package oop.animals;

public class Elephant extends Animal {

    int trunkSize;

    Elephant() {
        food = "vegetables";
    }

    @Override
    void makeNoise() {
        System.out.println("Phht!");
    }

    @Override
    void doTricks() {
        System.out.println(name + " twirled their trunk!");
    }

}
