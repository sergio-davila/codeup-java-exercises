import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
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

        System.out.println("Give me 3 numbers, a length, a width, and a height! I want to get the area and the perimeter of a rectangle!");
        String numString1 = sc.next();
        String numString2 = sc.next();
        String numString3 = sc.next();
        double length = Double.parseDouble(numString1);
        double width = Double.parseDouble(numString2);
        double height = Double.parseDouble(numString3);
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);
        double area = length * width;
        System.out.printf("The area of your rectangle is %.0f\n", area);
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The perimeter of your rectangle is %.0f\n", perimeter);
        double volume = length * width * height;
        System.out.printf("The volume of your rectangle is %.0f\n", volume);

    }
}
