package oopLecture;

public class Person {
    public String firstName;
    public String lastName;
    public String joinsChat() {
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static long worldPop = 7_860_000_000L;

    public static void main(String[] args) {
        Person alex = new Person();
        Person vanessa = new Person();
        Person douglas = new Person();
        System.out.println("alex = " + alex);

        String myName = "Alex";
        alex.firstName = myName;
        alex.lastName = "Davila";

        vanessa.firstName = "Vanessa";
        vanessa.lastName = "Noriega";

        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

//        System.out.println("alex.firstName = " + alex.firstName);
//        System.out.println("alex.lastName = " + alex.lastName);


//        System.out.println("vanessa.firstName = " + vanessa.firstName);
//        System.out.println("alex.joinsChat() = " + alex.joinsChat());
//        System.out.println("vanessa.joinsChat() = " + vanessa.joinsChat());
        System.out.println("worldPop = " + worldPop);
        Person.worldPop += 1; // a new Person was created we need to adjust our worldPop!!
        System.out.println("Person.worldPop = " + Person.worldPop);

        //Hey, we can do this (instanceObject.classField, but ehhh, let's try not to
        System.out.println("douglas.worldPop = " + douglas.worldPop);

        // Person.firstName // access an instance field from the class is a no go!
    }
}
