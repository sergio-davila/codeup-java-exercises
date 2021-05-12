package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication{



    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student Vanessa = new Student("Vanessa");
        Vanessa.addGrade(85);
        Vanessa.addGrade(90);
        Vanessa.addGrade(75);

        Student Jake = new Student("Jake");
        Jake.addGrade(95);
        Jake.addGrade(90);
        Jake.addGrade(97);

        Student Irfa = new Student("Irfa");
        Irfa.addGrade(75);
        Irfa.addGrade(80);
        Irfa.addGrade(70);

        Student Brandon = new Student("Brandon");
        Brandon.addGrade(60);
        Brandon.addGrade(55);
        Brandon.addGrade(32);

        students.put("vanessa-noriega", Vanessa);
        students.put("jakechadwell", Jake);
        students.put("irfa-sheikh", Irfa);
        students.put("brandonBannedOnTwitter69420", Brandon);

        boolean looper = true;

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students:");


        while (looper) {
            Scanner sc = new Scanner(System.in);
            System.out.println(students.keySet());
            System.out.println("What student would you like to see more information on? Please be precise.");
            String userInput = sc.next();
//                System.out.println(key);
            if (userInput != null && students.containsKey(userInput)) {
                    System.out.println("Name: " + students.get(userInput).getName() + " - Github username: " + userInput);
                    System.out.println("All grades for " + userInput + ": " + students.get(userInput).getGrades());
                    System.out.printf("Current Average: %.2f\n", students.get(userInput).getGradeAverage());
            }

            else {
                    System.out.println("Sorry, no student found with the Github username of " + userInput);
            }


            boolean looper2 = true;
            while (looper2) {
                System.out.println("Here are some more options to move forward:");
                System.out.println("0 - Exit program");
                System.out.println("1 - View another student's info");
                System.out.println("2 - View all grades for all students");
                System.out.println("3 - View overall class average");
                System.out.println("4 - View a csv report of all the students");

                int yOrN = sc.nextInt();

                if (yOrN == 1) {
//                    System.out.println("What student would you like to see more information on? Please be precise.");
                    looper2 = false;
                }

                else if (yOrN == 2) {
                    for (String key : students.keySet()) {
                        System.out.println(students.get(key).getName() + "'s grades: " + students.get(key).getGrades());
                    }
                }

                else if(yOrN == 3) {
                    double total = 0;
                    for (String key : students.keySet()) {
                        total += students.get(key).getGradeAverage();
                    }
                    double classSize = students.size();
                    double totalAvg = total / classSize;
                    System.out.printf("The total class average is: %.2f\n", totalAvg);
                }

                else if (yOrN == 4) {
                    for (String key : students.keySet()) {
                        System.out.printf(students.get(key).getName() + "," + key + ",%.2f\n", students.get(key).getGradeAverage());
                    }
                }

                else if (yOrN == 0) {
                        System.out.println("No more students for you!");
                        looper2 = false;
                        looper = false;
                    }

                else {
                        System.out.println("Try again.");
                    }
                }

            }

    }
}
