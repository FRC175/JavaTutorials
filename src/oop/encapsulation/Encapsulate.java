package oop.encapsulation;

public class Encapsulate {

    // Only characters and spaces
    private String name;
    // Cannot be negative, cannot be over 110
    private int age;
    // 1-6
    private int roll;

    public void setName(String newName) {
        if (isStringAName(newName) == true) {
            name = newName;
        } else {
            System.out.println("Name is invalid");
            name = "Name";
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge < 1 || newAge > 110) {
            System.out.println("Age is invalid.");
            age = 1;
        } else {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setRoll(int newRoll) {
        if (newRoll < 1 || newRoll > 6) {
            System.out.println("Roll is invalid.");
            roll = 1;
        } else {
            roll = newRoll;
        }
    }

    public int getRoll() {
        return roll;
    }

    // Helper method
    private boolean isStringAName(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(Character.isLetter(ch) || ch == ' ')) {
                return false;
            }
        }

        return true;
    }

}
