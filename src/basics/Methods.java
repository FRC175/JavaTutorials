package basics;

public class Methods {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    void doSomething() {
        int i = 0;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int sum = m.add(1, 2);
    }

}
