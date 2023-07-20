import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getInput(sc);

        double d2 = getInput(sc);

        double result = d1 / d2;

        System.out.println("The answer is " + result);

    }

    private static double getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextDouble();
    }
}