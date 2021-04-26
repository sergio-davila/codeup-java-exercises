import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1a.
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        1b.
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        double i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        1c.
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (double i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        2.
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 & i % 5 == 0) {
//                System.out.println(i + " F I Z Z B U Z Z");
//            } else if (i % 3 == 0) {
//                System.out.println(i + " Fizz!");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " Buzz!");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hey give me a number, I'm gonna give you a table about it!");
//        double userNum = sc.nextInt();
//        System.out.println("Here's your table!");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------------------------");
//        for (double i = 0; i <= userNum; i++) {
//            double squared = i * i;
//            double cubed = i * i * i;
//            System.out.printf("%.0f      | %.0f       | %.0f    \n", i, squared, cubed);
//        }

//        4.
        boolean userAgrees = true;
        while(userAgrees) {
            System.out.println("Could you please input what grade you got as a number?");
            double userGrade = sc.nextDouble();
            if (userGrade >= 88 & userGrade <= 100) {
                System.out.printf("Congrats, your %.0f got you an A!\n", userGrade);
                //userAgrees = false;
            } else if (userGrade >= 80 & userGrade <= 87) {
                System.out.printf("Nice, your %.0f got you a B!\n", userGrade);
                //userAgrees = false;
            } else if (userGrade >= 67 & userGrade <= 79) {
                System.out.printf("Okay you still passed, your %.0f got you a C.\n", userGrade);
                //userAgrees = false;
            } else if (userGrade >= 60 & userGrade <= 66) {
                System.out.printf("Oof, your %.0f got you a D.\n", userGrade);
                //userAgrees = false;
            } else if (userGrade >= 0 & userGrade <= 59) {
                System.out.printf("So your %.0f got you an F, you really need help lol.\n", userGrade);
                //userAgrees = false;
            } else {
                System.out.println("It's impossible to get that grade, try again.");
                continue;
            }
            System.out.println("Would you like to input another numerical grade so you can get a letter grade? Please answer with either a yes or no.");
            boolean looper = true;
            while (looper) {
                String yesNo = sc.next();
                if (yesNo.equalsIgnoreCase("yes")) {
                    System.out.println("Ok here we go again!");
                    looper = false;
                } else if (yesNo.equalsIgnoreCase("no")) {
                    System.out.println("Alright, thanks for participating!");
                    looper = false;
                    userAgrees = false;
                } else {
                    System.out.println("Try spelling that again lol.");
                }
            }
        }
    }
}
