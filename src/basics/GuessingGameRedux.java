package basics;

import java.util.Scanner;

public class GuessingGameRedux {

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 0 and 90.");
        int answer = (int) (Math.random() * 100);
        int guess = -1;
        Scanner keyboard = new Scanner(System.in);

        while (guess != answer) {
            System.out.println("Guess the number I'm thinking of");
            guess = keyboard.nextInt();
            if (guess == answer) {
                System.out.println("You got it right.");
            } else if (guess > answer) {
                System.out.println("Try again. The answer is lower.");
            } else {
                System.out.println("Try again. The answer is higher.");
            }
        }
    }

}
