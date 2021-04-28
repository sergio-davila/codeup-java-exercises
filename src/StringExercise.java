import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        // 1.
        String stringyWingy = "We don't need no education";
        System.out.println(stringyWingy);
        String stringyWingy2 = stringyWingy.replace("no education", "no thought control");
        System.out.println(stringyWingy2);

        String stringyWingy3 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println("stringyWingy3 = " + stringyWingy3);

        // Bob.
        bob();
    }

    // 2.
    public static void bob() {
        System.out.println("Go ahead and tell something to Bob the lackadaisical teen, could be a question or a statement!");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

//        boolean looper = true;
//        while (looper) {
//            System.out.println("Wanna talk to him again? Answer with just a yes or no please.");
//            String YorN = sc.next();
//            if (YorN.equalsIgnoreCase("yes")) {
//                System.out.println("Here we go again, I guess.");
//                looper = false;
//                bob();
//            } else if (YorN.equalsIgnoreCase("no")) {
//                System.out.println("Fine I guess, BYE.");
//                looper = false;
//            } else {
//                System.out.println("Try answering correctly, ya bozo.");
//            }
//        }
    }
}
