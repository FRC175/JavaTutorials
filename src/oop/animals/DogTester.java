package oop.animals;

public class DogTester {

    public static void main(String[] args) {
        Dog jerry = new Dog();
        jerry.setName("Jerry");
        jerry.setAge(32);
        jerry.setSize(1);
        jerry.setBreed("Pug");
        jerry.setFurColor("pink");
        jerry.run();
        jerry.eat();
        jerry.sleep();
        System.out.println(jerry.description());

        Dog tim = new Dog();
        tim.setName("Tim");
        tim.setAge(3);
        tim.setSize(10);
        tim.setBreed("German Shepard");
        tim.setFurColor("Brown");
        tim.run();
        tim.eat();
        tim.sleep();
        tim.makeNoise();
        System.out.println(tim.description());
    }

}
