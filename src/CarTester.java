public class CarTester {

    public static void main(String[] args) {
        Car elonMusk = new Car("ElonMusk", "electric", 1995, 12000, 50000, "Blue", 125);

        System.out.println("Make: " + elonMusk.getMake());
        System.out.println("Model: " + elonMusk.getModel());
        System.out.println("year: " + elonMusk.getYear());
        System.out.println("mileage: " + elonMusk.getMileage());
        System.out.println("price: " + elonMusk.getPrice());
        System.out.println("color: " + elonMusk.getColor());
        System.out.println("topSpeed: " + elonMusk.getTopSpeed());

        elonMusk.accelerate();
        elonMusk.brake();
        elonMusk.decelerate();
    }

}
