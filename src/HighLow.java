import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        numGuesser();
    }


    public static void numGuesser() {
        int randomNum = (int) (Math.random() * 101);
        System.out.println("My random generator has generated a number between 1 and 100");
        System.out.println(randomNum);
        System.out.println("Please guess a number between 1 and 100, keep in mind you only have 10 guesses >:)");
        Scanner sc = new Scanner(System.in);
        double userNum = sc.nextDouble();
        if (userNum < 0 || userNum > 100) {
            System.out.println("Try again.");
            numGuesser();
        }

        boolean highLow = true;
        int guessAttempts = 1;
        while (highLow) {
            if (userNum < randomNum && guessAttempts <= 10) {
                System.out.printf("Guess #%d\n", guessAttempts);
                System.out.println("Go higher! Input another number!");
                guessAttempts += 1;
                userNum = sc.nextDouble();
            } else if (userNum > randomNum && guessAttempts <= 10) {
                System.out.printf("Guess #%d\n", guessAttempts);
                System.out.println("Go lower! Input another number!");
                guessAttempts += 1;
                userNum = sc.nextDouble();
            } else if (userNum == randomNum) {
                System.out.println("Correcto guesso!");
                highLow = false;
            }
            if (guessAttempts == 11) {
                System.out.println("So sorry, you're out of attempts! Try again later! >:)");
                highLow = false;
            }
        }

    }
}
