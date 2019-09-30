import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 99) + 1;
        int count = 0;
        int guess = 0;

        System.out.println("I am thinking of a number from 1 to 100... Guess what it is.");

        while (guess != randomNum) {
            guess = keyboard.nextInt();
            count++;

            if (guess > randomNum) {
                System.out.println("Lower!");
            } else if (guess < randomNum) {
                System.out.println("Higher!");
            }
        }

        System.out.println("Congratulations. You guessed the number with " + count + " tries!");
    }

}
