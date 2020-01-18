package oop.animals;

public class DogTester {

    public static void main(String[] args) {
        Dog jerry = new Dog();
        jerry.name = "Jerry";
        jerry.age = 32;
        jerry.size = 1;
        jerry.breed = "Pug";
        jerry.furColor = "pink";
        jerry.run();
        jerry.eat();
        jerry.sleep();
        System.out.println(jerry.description());

        Dog tim = new Dog();
        tim.name = "Tim";
        tim.age = 3;
        tim.size = 10;
        tim.breed = "German Shepard";
        tim.furColor = "Brown";
        tim.run();
        tim.eat();
        tim.sleep();
        tim.makeNoise();
        System.out.println(tim.description());
    }

}
