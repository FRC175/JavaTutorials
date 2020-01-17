package basics;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isResponseCorrect, isUserStupid;

        int response;
        int requested = 15;

        System.out.println("Enter the integer: " + requested);
        response = input.nextInt();

        isResponseCorrect = (response == requested);
        isUserStupid = !(response == requested);
        // isUserStupid = response != requested;

        System.out.println("You entered the requested integer: " + isResponseCorrect);
        System.out.println("You are stupid: " + isUserStupid);

        /*String response;
        String requested = "peasant";
        System.out.println("Enter the word: \"" + requested + "\"");
        response = input.nextLine();

        isResponseCorrect = (response.equals(requested));
        isUserStupid = !(response.equals(requested));

        System.out.println("You entered the requested word: " + isResponseCorrect);
        System.out.println("You are stupid: " + isUserStupid);*/

        /*if (response.equals(requested))
            System.out.println("Good job!");
        else
            System.out.println("You are stupid.");*/
    }

}
