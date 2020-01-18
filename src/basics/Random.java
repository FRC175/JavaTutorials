package basics;

public class Random {

    public static void main(String[] args) {
        int max = 1500;
        int min = 5;
        // Formula for a random number in any range
        // random() * ((max - min) + 1) + min
        int randomNumber = (int) ((Math.random() * ((max - min) + 1)) + min);
        System.out.println("Here is a random number...");
        System.out.println(randomNumber);
    }

}
