package oop.animals;

public class LionTester {

    public static void main(String[] args) {
        Lion tyler = new Lion();
        tyler.name = "Tyler";
        tyler.age = -749043745;
        tyler.breed = "Thicc";
        tyler.size = 240;
        tyler.mane  = "Floofy";
        tyler.gender = "Male";
        tyler.furColor = "Beige";
        tyler.run();
        tyler.chase();
        tyler.doTricks();
        tyler.makeNoise();
        tyler.eat();
        tyler.sleep();
        System.out.println(tyler.description());
    }

}
