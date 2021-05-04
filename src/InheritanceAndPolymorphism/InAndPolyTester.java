
package InheritanceAndPolymorphism;

import oopLecture.Person;

public class InAndPolyTester {

    public static void main(String[] args) {
        Person person = new Person("Douglas", "Hirsh");
        //person.firstName = "Douglas";

        System.out.println("person.joinsChat() = " + person.joinsChat());

        System.out.println("person.sayHello() = " + person.sayHello());

        Employee employee = new Employee("Kenneth", "Howell");
        String greeting = employee.joinsChat();
        //employee.firstName = "Douglas";

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
        System.out.println("Zooming in a bus at " + bus.getMaxSpeed() + " MpH with " + bus.getNumberOfOccupants() + " occupants inside.");

        Jet fastJet = new Jet(2000);
        fastJet.setNumberOfOccupants(1);
        fastJet.start();
        System.out.println("Zooming in a fast jet at " + fastJet.getMaxSpeed() + "MPH with " + fastJet.getNumberOfOccupants() + "occupants inside.");

        System.out.println();



        Vehicle fasterBus = spawnVehicle("bus",120);
        fasterBus.start();

        //casting method:
//        Bus fasterBus = (Bus)spawnVehicle("bus",120);
//        fasterBus.start();
//        fasterBus.honkHorn();

        Vehicle slowerJet = spawnVehicle("jet", 700);
        slowerJet.start();

    }

    public static Vehicle spawnVehicle(String vehicleType, int maxSpeed) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case "vehicle":
                vehicle = new Vehicle(maxSpeed);
                break;

            case "bus" :
                vehicle = new Bus(maxSpeed);
                break;

            case "jet" :
                vehicle = new Jet(maxSpeed);
                break;
        }

        return vehicle;
    }

}