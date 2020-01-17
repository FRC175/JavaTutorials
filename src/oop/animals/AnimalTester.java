package oop.animals;

public class AnimalTester {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 10;
        d.type = "German Shepard";
        d.name = "Rocky";

        System.out.println(d.description());
        d.makeNoise();
        d.roll();
        d.sit();

        Elephant e = new Elephant();
        e.size = 50;
        e.type = "Indian";
        e.name = "Aisthu";

        System.out.println(e.description());
        e.makeNoise();
        e.storm();
        e.sit();
    }

}
