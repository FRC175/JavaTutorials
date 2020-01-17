package basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 12345;
        int numOfAttempts = 0;

        System.out.println("Welcome to the bank.");
        System.out.print("Enter your pin: ");
        int entry = input.nextInt();
        numOfAttempts++;

        while (entry != pin && numOfAttempts < 3) {
            System.out.println("Incorrect pin. Try again.");
            System.out.println();
            System.out.print("Enter your pin: ");
            entry = input.nextInt();
            numOfAttempts++;
        }
        System.out.println();

        if (entry == pin)
            System.out.println("Pin accepted. You now have access to your account.");
        else if (numOfAttempts >= 3)
            System.out.println("You have run out attempts. Account locked!");
    }

}
