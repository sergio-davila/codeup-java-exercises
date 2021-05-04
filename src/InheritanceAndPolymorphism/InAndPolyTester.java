package InheritanceAndPolymorphism;

import oopLecture.Person;

import java.util.Locale;

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

        Jet fastJet = new Jet(2000);
        fastJet.setNumberOfOccupants(1);
        fastJet.start();
        System.out.println("ZOOMIN in a jet at " + fastJet.getMaxSpeed() + "mph with " + bus.getNumberOfOccupants() + " occupants inside!");
        System.out.println();
//        Vehicle fasterBus = spawnVehicle("bus",120);
        Bus fasterBus = (Bus)spawnVehicle("bus",120);
        fasterBus.honkHorn();
        fasterBus.start();

        Vehicle slowerJet = spawnVehicle("jet", 700);
        slowerJet.setNumberOfOccupants(2);
        slowerJet.start();
    }



    public static Vehicle spawnVehicle(String vehicleType, int maxSpeed) {
        Vehicle vehicle = null;

        switch (vehicleType.toLowerCase()) {
            case "vehicle":
                vehicle = new Vehicle(maxSpeed);
                break;
            case "bus":
                vehicle = new Bus(maxSpeed);
                break;
            case "jet":
                vehicle = new Jet(maxSpeed);
                break;
        }

        return vehicle;
    }
}
