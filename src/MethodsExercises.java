import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//    Addition(5, 78);
//    Subtraction(65, 42);
//    Multiplication(53, 42);
//    Division(32, 6);
//    Modulus(5, 4);

//    System.out.println("Enter a number between 1 and 10: ");
//    boolean userInputCorrect = true;
//    getInteger(1, 12);
        factorial();

    }
    // 1.
    public static void Addition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void Subtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }

    public static void Multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    public static void Division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(result);
    }

    public static void Modulus(int num1, int num2) {
        int result = num1 % num2;
        System.out.println(result);
    }

    // 2.
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: \n", min, max);
        int userInput = sc.nextInt();
        if (userInput > min && userInput < max) {
            System.out.printf("Congrats, your input of %d was within our min and max!", userInput);
            return userInput;
        }
        System.out.printf("Your input was not between %d and %d, try again.\n", min, max);
        return getInteger(min, max);
    }

    // 3.
    public static long factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        long factor = 1;
        if (userInput > 1 && userInput < 10) {
            for (int i = 1; i <= userInput; i++) {
                factor *= i;
                System.out.printf("%d! = ", i);
//                System.out.printf("%d", i);
                System.out.printf("%d\n", factor);
            }
        } else {
            System.out.println("Try again.");
            return factorial();
        }
        boolean userContinue = true;
        while (userContinue) {
            System.out.println("Do you wish to get factorial to another number? Please only answer with a yes or no.");
            String yesOrNo = sc.next();
            if(yesOrNo.equalsIgnoreCase("yes")) {
                System.out.println("Okay, here we go again!");
                userContinue = false;
                return factorial();
            } else if(yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("Thank you for participating.");
                userContinue = false;
            } else {
                System.out.println("Try again.");
            }
        } return userInput;
    }

    // 4.
//    public static int rollDice() {
//        System.out.println("Please enter the number of sides for your preferred pair of dice.");
//
//    }
//
//
//    int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;


}
