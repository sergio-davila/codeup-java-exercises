import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        numGuesser();
    }


    public static void numGuesser() {
        int randomNum = (int) (Math.random() * 101);
        System.out.println("My random generator has generated a number between 1 and 100");
        System.out.println(randomNum);
        System.out.println("Please guess a number between 1 and 100");
        Scanner sc = new Scanner(System.in);
        double userNum = sc.nextDouble();
        if (userNum < 0 || userNum > 100) {
            System.out.println("Try again.");
            numGuesser();
        }

        boolean highLow = true;

        while (highLow) {
            if (userNum < randomNum) {
                System.out.println("Go higher! Input another number!");
                userNum = sc.nextDouble();
            } else if (userNum > randomNum) {
                System.out.println("Go lower! Input another number!");
                userNum = sc.nextDouble();
            } else if (userNum == randomNum) {
                System.out.println("Correcto guesso!");
                highLow = false;
            }
        }

    }
}
