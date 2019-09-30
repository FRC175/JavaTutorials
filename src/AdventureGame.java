import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int room = 1;
        String choice = "";

        while (room != 0) {
            if (room == 1) {
                System.out.println("You are in a small room. There is a \"closet\" and a doorway to the \"hall\".");
                System.out.print("> ");
                choice = input.nextLine();
                if (choice.equals("closet"))
                    room = 2;
                else if (choice.equals("hall"))
                    room = 3;
                else
                    System.out.println(choice + " wasn't one of the options. Try again.");
            } else if (room == 2) {
                System.out.println("You're in a barren closet. There's nothing to do here except go \"back\".");
                System.out.print("> ");
                choice = input.nextLine();
                if (choice.equals("back"))
                    room = 1;
                else
                    System.out.println(choice + " wasn't one of the options. Try again.");
            } else if (room == 3) {
                System.out.println("You find yourself in a concrete hallway. Oddly, there is only a single \"door\" visible. " +
                        "Otherwise, the hall just extends about fifteen feet in either direction, and ends in a smooth, blank, concrete wall. " +
                        "Do you want to enter the \"door\" or approach the \"wall\" looking for clues?");
                System.out.print("> ");
                choice = input.nextLine();
                if (choice.equals("door"))
                    room = 1;
                else if (choice.equals("wall"))
                    room = 4;
                else
                    System.out.println(choice + " wasn't one of the options. Try again.");
            } else if (room == 4) {
                System.out.println("Upon closer inspection, the seemingly blank wall shimmers ever so slightly in the dim light. " +
                        "You put forward a tentative hand, and it pushes through, a feeling of static sliding up your arm.");
                System.out.println();
                System.out.println("You pass through the portal into the unknown....");
                room = 0;
            }
        }
    }

}
