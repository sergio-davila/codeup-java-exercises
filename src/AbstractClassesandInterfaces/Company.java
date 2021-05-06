package AbstractClassesandInterfaces;

public class Company {

    public static void main(String[] args) {
        Employee numberBot = new Accountant("NumberBot", "Accounting", 001);


        System.out.println("numberBot.name = " + numberBot.name);
        System.out.println("numberBot.department = " + numberBot.department);
        System.out.println("numberBot.work() = " + numberBot.work());


    }
}
