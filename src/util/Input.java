package util;
import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    public String getString() {
        System.out.println("Please input any random string please!");
        return sc.next();
    }

    public boolean yesNo() {
        System.out.println("Please input a variant of yes.");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("yea") || userInput.equalsIgnoreCase("yeah") || userInput.equalsIgnoreCase("yis") || userInput.equalsIgnoreCase("yas") || userInput.equalsIgnoreCase("yup") || userInput.equalsIgnoreCase("yep") || userInput.equalsIgnoreCase("yarp") || userInput.equalsIgnoreCase("si") || userInput.equalsIgnoreCase("simon") || userInput.equalsIgnoreCase("ya") || userInput.equalsIgnoreCase("yee") || userInput.equalsIgnoreCase("ok");
    }

    public int getInt(int min, int max) {
        System.out.printf("Please input a number between %d and %d", min, max);
        int userInput = sc.nextInt();
        if (userInput > min && userInput < max) {
            System.out.println("Ya did it!");
            return userInput;
        } else {
            System.out.println("Try again.");
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Please input an integer");
        int userInput = sc.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Pretty please input a number between %f and %f", min, max);
        double userInput = sc.nextDouble();
        if (userInput > min && userInput < max) {
            System.out.println("Ya did it!");
            return userInput;
        } else {
            System.out.println("Try again.");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Please input any number");
        double userInput = sc.nextDouble();
        return userInput;
    }

    public static void main(String[] args) {

    }

}