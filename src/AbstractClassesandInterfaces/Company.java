package AbstractClassesandInterfaces;

public class Company {

    public static void main(String[] args) {
        Employee numberBot = new Accountant("NumberBot", "Accounting", 001);
        Employee cleanerBot = new Custodian("cleanerBot", "Maintenance", 002);

        System.out.println("numberBot.name = " + numberBot.name);
        System.out.println("numberBot.department = " + numberBot.department);
        System.out.println("numberBot.work() = " + numberBot.work());
        System.out.println();
        System.out.println("cleanerBot.name = " + cleanerBot.name);
        System.out.println("cleanerBot.department = " + cleanerBot.department);
        System.out.println("cleanerBot.work() = " + cleanerBot.work());


    }
}
