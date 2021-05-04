package InheritanceAndPolymorphism;

import oopLecture.Person;

public class InAndPolyTester {

    public static void main(String[] args) {
        Person person = new Person("Douglas", "Hirsh");
//        person.firstName = "Douglas";
//        person.lastName = "Hirsh";


        System.out.println("person.joinsChat() = " + person.joinsChat());

        Employee employee = new Employee("Kenneth", "Howell");
        String greeting = employee.joinsChat();


        System.out.println("greeting = " + greeting);
        employee.doWork();

        System.out.println("employee.sayHello() = " + employee.sayHello());
    }
}
