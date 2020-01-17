package basics;

import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = 0;
        String response = "";

        while (true) {
            System.out.println("Ask a yes or no question:");
            String question = input.nextLine();

            random = (int) (Math.random() * 8);
            if (random == 0)
                response = "Outlook good";
            else if (random == 1)
                response = "It is certain";
            else if (random == 2)
                response = "It is decidedly so";
            else if (random == 3)
                response = "Without a doubt";
            else if (random == 4)
                response = "Yes - definitely";
            else if (random == 5)
                response = "You may rely on it";
            else if (random == 6)
                response = "As I see it, yes";
            else if (random == 7)
                response = "Most likely";

            System.out.println(response);
            System.out.println();
        }
    }

}
