import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");

        // =========================================== print() and println()

        // this:
//        System.out.println("here");
//        System.out.println("there");

        // is equivalent to this:
//        System.out.print("here\n");
//        System.out.print("there\n");

        // without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");

        // to concatenate, jut like JS:
        String firstName = "Alex";
        String lastName = "Davila";
        System.out.print(firstName + " " + lastName);

        // =========================================== printf() / .format()

        // same output as print():
        System.out.printf("here");
        System.out.printf("there");

        // creating multiple variables:
        System.out.printf("Hello, %s!\n", firstName);
        System.out.printf("Hello, %s %s!\n", firstName, lastName);

        // numbers
        int numberOfPets = 3;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s.\n", numberOfPets, typeOfPets);

        // currency
        float currencyPennies = 1000.001F;
        System.out.printf("My iphone cost $%.2f\n", currencyPennies);

        // ==================== USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your fist name?");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you, %s\n", userFirstName);

        System.out.println("How old are you?");

        int age = sc.nextInt();

        System.out.printf("Holy crap you're %d years old?!", age);



    }
}


