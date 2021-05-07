package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        double totalNums = this.grades.size();
        for (double grade : this.grades) {
            total += grade;
        }
        return total / totalNums;
    }

    public static void main(String[] args) {


//        String [] blah = {"hey", "im", "an", "array"};
//        System.out.println("blah.length = " + blah.length);

        Student Vanessa = new Student("Vanessa");

        System.out.println("Vanessa.name = " + Vanessa.name);
        System.out.println("Vanessa.grades = " + Vanessa.grades);

        Vanessa.addGrade(85);
        Vanessa.addGrade(90);
        Vanessa.addGrade(75);
        Vanessa.addGrade(95);

        System.out.println("Vanessa.grades = " + Vanessa.grades);
        System.out.println("Vanessa.grades.size() = " + Vanessa.grades.size());
        System.out.println("Vanessa.getGradeAverage() = " + Vanessa.getGradeAverage());
    }
}
