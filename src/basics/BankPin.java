package basics;

import java.util.Scanner;

public class BankPin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        String status = "locked";

        while (!status.equals("unlocked")) {
            System.out.println("Enter pin");
            int userInput = input.nextInt();

            if (userInput == pin) {
                System.out.println("Welcome to the bank!");
                status = "unlocked";
            } else {
                System.out.println("Access denied.");
            }
        }
    }

}
