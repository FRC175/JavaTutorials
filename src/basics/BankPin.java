package basics;

import java.util.Scanner;

public class BankPin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        boolean isUnlocked = false;
        int numberOfTries = 5;

        while (isUnlocked == false && numberOfTries > 0) {
            System.out.println("Enter pin");
            int userInput = input.nextInt();

            numberOfTries--;

            if (userInput == pin) {
                System.out.println("Welcome to the bank!");
                isUnlocked = true;
            } else {
                System.out.println("Access denied.");

                if (numberOfTries <= 0) {
                    System.out.println("You are out of tries.");
                } else {
                    System.out.println("You have " + numberOfTries + " tries left.");
                }
            }
        }
    }

}
