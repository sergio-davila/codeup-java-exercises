import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.println("Type in a number, any number!");
//        int i = sc.nextInt();
//        System.out.println("Here's your number: " + i);

//        System.out.println("Type in 3 words with spaces in between please.");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        System.out.println("Type in a sentence please!");
//        String sentence = sc.nextLine(); // sc.next only grabs the first word in a string
//        System.out.println(sentence);

        System.out.println("Give me 2 numbers, a length and a width!");
        String numString1 = sc.next();
        String numString2 = sc.next();
        double length = Double.parseDouble(numString1);
        double width = Double.parseDouble(numString2);
        System.out.println(length);
        System.out.println(width);

    }
}
