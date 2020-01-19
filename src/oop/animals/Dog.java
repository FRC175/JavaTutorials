package oop.animals;

public class Dog extends Animal {

    private String furColor;

    // Constructor
    // no return type
    // same name as the class
    Dog() {
        // What we change from superclass (Animal)
        // food = "meat";
        setFood("meat");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String newFurColor) {
        furColor = newFurColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark! Bark!");
    }

    @Override
    public String description() {
        return "The dog's name is " + getName() + ". The dog's breed is " + getBreed()
                + ". The dog's age is " + getAge() + ". The dog is " + getSize() +
                " inches tall. The dog's fur color is " + furColor + ".";
    }

}
