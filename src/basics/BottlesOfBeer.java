package basics;

public class BottlesOfBeer {

    public static void main(String[] args) {
        int bottleOfBeer = 99;

        while (bottleOfBeer > 0) {
            System.out.println(bottleOfBeer + " bottles of beer on the wall...");
            System.out.println(bottleOfBeer + " bottles of beer!");
            System.out.println("Take one down, pass it around...");
            bottleOfBeer--;
            if (bottleOfBeer != 0) {
                System.out.println(bottleOfBeer + " bottles of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer.");
            }
        }
    }

}
