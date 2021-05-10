package util;
import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    public String getString(String prompt) {
//        System.out.println("Please input any random string please!");
        System.out.println(prompt);
        return sc.next();
    }

    public boolean yesNo() {
        System.out.println("Please input a variant of yes.");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("yea") || userInput.equalsIgnoreCase("yeah") || userInput.equalsIgnoreCase("yis") || userInput.equalsIgnoreCase("yas") || userInput.equalsIgnoreCase("yup") || userInput.equalsIgnoreCase("yep") || userInput.equalsIgnoreCase("yarp") || userInput.equalsIgnoreCase("si") || userInput.equalsIgnoreCase("simon") || userInput.equalsIgnoreCase("ya") || userInput.equalsIgnoreCase("yee") || userInput.equalsIgnoreCase("ok");
    }

//    public int getInt(int min, int max) {
//        System.out.printf("Please input a number between %d and %d", min, max);
//        int userInput = sc.nextInt();
//        if (userInput > min && userInput < max) {
//            System.out.println("Ya did it!");
//            return userInput;
//        } else {
//            System.out.println("Try again.");
//            return getInt(min, max);
//        }
//    }
//
//    public int getInt() {
//        System.out.println("Please input an integer");
//        int userInput = sc.nextInt();
//        return userInput;
//    }

//    public double getDouble(double min, double max) {
//        System.out.printf("Pretty please input a number between %f and %f", min, max);
//        double userInput = sc.nextDouble();
//        if (userInput > min && userInput < max) {
//            System.out.println("Ya did it!");
//            return userInput;
//        } else {
//            System.out.println("Try again.");
//            return getDouble(min, max);
//        }
//    }
//
//    public double getDouble() {
//        System.out.println("Please input any number");
//        double userInput = sc.nextDouble();
//        return userInput;
//    }

    public void getInt() {
        try {
        String userInput = getString("Please input any random integer please!");
        System.out.println(Integer.valueOf(userInput));
        System.out.println(Integer.valueOf(userInput));
        } catch (NumberFormatException e) {
            e.printStackTrace(System.out);
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("THAT'S A STRING YA FOOL!");
        }
    }

    public double getDouble() {
        try {
            System.out.println("Please input any random number please!");
            String userInput = sc.next();
            System.out.println(Double.valueOf(userInput));
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            e.printStackTrace(System.out);
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("THAT'S A STRING YA FOOL!");
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        Input input = new Input();
        input.getDouble();
        input.getInt();
    }

}
