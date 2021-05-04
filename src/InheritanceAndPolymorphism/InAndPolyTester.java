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

        Vehicle genericVehicle = new Vehicle();
        genericVehicle.start();

        Bus bus = new Bus(80);
        bus.setHeadlightsOn(true);
        bus.start();
        bus.honkHorn();
        bus.setNumberOfOccupants(2);
        System.out.println("Shmovin in a bus at " + bus.getMaxSpeed() + "mph with " + bus.getNumberOfOccupants() + " occupants inside!");
    }
}
