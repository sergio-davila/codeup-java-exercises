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
    getInteger(1, 12);

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



}
