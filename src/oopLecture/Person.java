package oopLecture;

public class Person {
    public String firstName;
    public String lastName;
    public String joinsChat() {
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static void main(String[] args) {
        Person alex = new Person();
        System.out.println("alex = " + alex);

        String myName = "Alex";

        alex.firstName = myName;
        alex.lastName = "Davila";

        System.out.println("alex.firstName = " + alex.firstName);
        System.out.println("alex.lastName = " + alex.lastName);

        Person vanessa = new Person();
        vanessa.firstName = "Vanessa";
        vanessa.lastName = "Noriega";

        System.out.println("vanessa.firstName = " + vanessa.firstName);
        System.out.println("alex.joinsChat() = " + alex.joinsChat());
        System.out.println("vanessa.joinsChat() = " + vanessa.joinsChat());
    }
}
