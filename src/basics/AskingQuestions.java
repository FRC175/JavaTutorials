package basics;

import java.util.Scanner;

public class AskingQuestions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("How much do you weigh (in lb)?");
        double weight = input.nextDouble();

        System.out.println("Hello, " + name + "! You are " + age + " years old and you weigh " + weight + " pounds.");
    }

}
