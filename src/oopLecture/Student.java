package oopLecture;

public class Student {
    //Each Student will have...
    public String name;
    public String cohort;
    public String campus;
    private double grade;
    // we could set this up for defaults, as in no name or cohort being passed through
    public Student () {
        this.name = "Unknown";
        this.cohort = "Unassigned";
        this.campus = "TBD";
        this.grade = 0;
    }

    //Set this one up for just the name being passed through
    public Student (String studentName) {
        this.name = studentName;
        this.cohort = "Unassigned";
        this.campus = "TBD";
        this.grade = 0;
    }

    //And this one for both name and cohort being passed through!
    public Student (String studentName, String assignedCohort) {
        this.name = studentName;
        this.cohort = assignedCohort;
        this.campus = "TBD";
        this.grade = 0;
    }

    public Student (String studentName, String assignedCohort, double grade) {
        this.name = studentName;
        this.cohort = assignedCohort;
        this.campus = "TBD";
        this.grade = 98;
    }

    public static void main(String[] args) {
        // Old way of doing things, very long winded and a lot of typing, have to fill out fields ourselves
//        Student example = new Student();
//        Student example2 = new Student();

//        example.name = "Example name";
//        example.cohort = "Unassigned";
//
//        example2.name = "Example name 2";
//        example2.cohort = "Unassigned 2";


        // Now though: Let's use our constructor
        //This one for both parameters being used
        Student alex = new Student("Alex Davila", "Marco");
        //alex.name = "Alex Davila", we don't do this!
        System.out.println("alex.name = " + alex.name);
        System.out.println("alex.cohort = " + alex.cohort);
        System.out.println("alex.campus = " + alex.campus);
        // This one for just the name
        Student iffy = new Student("Iffy");
        System.out.println("iffy.name = " + iffy.name);
        System.out.println("iffy.cohort = " + iffy.cohort);
        // And finally this one with nothing being passed through!
        Student unknown = new Student();
        System.out.println("unknown.name = " + unknown.name);
        System.out.println("unknown.cohort = " + unknown.cohort);


    }


}
