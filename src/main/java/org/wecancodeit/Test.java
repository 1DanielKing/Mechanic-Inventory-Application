package org.wecancodeit;

public class Test {
    static Operation operation = new Operation();
    static Garage garage = new Garage();

    public static void main(String tests[]) {
        testList(garage);
        testCaseAndTotalFlow();
    }
    public static void testCaseAndTotalFlow() {
        System.out.println("Testing test case 1 - (Enter 1 at prompt!)");
        operation.choice(garage);
    }

    // test add, remove, and list methods from Garage class
    // @testAddRemoveList
    //
    public static void testList(Garage garage) {
        System.out.println(" adding vehicles and then testing our list method ");
        Vehicle tesla = new EVCar(10_000, 100, 400, 2022, "Tesla Model Y", "T3301");
        Vehicle tesla2 = new EVCar(80000, 1, 50, 2020, "Tesla Model X", "T3302");
        Vehicle rivian = new AICar(35000, 1, 50, 2019, "Tesla Model X", "RIV02");
      //  Vehicle chevy = new GasCar(14, 10000, 110, 400, 2010, "Chevy Cruze", "1G1FB");
        garage.addVehicleB(tesla);
        garage.addVehicleB(tesla2);
        garage.addVehicleB(rivian);
   //     garage.addVehicleB(chevy);
        garage.listOfAllVehicle();
        // System.out.println(" ");
        // System.out.println(" <test: removing tesla model Y> ");
        // System.out.println(" ");
        // garage.removeVehicle();
        // garage.listOfAllVehicle();
    }


}

// System.out.println("\n testing Vehicle object Chevy which is type GasCar for
// its contained abstract methods\n");
// Vehicle child classes methods testing
// tesla.start();
// tesla.stop();
// tesla.drive();
// tesla.maintenance();
// chevy.start();
// chevy.drive();
// chevy.stop();
// chevy.maintenance();

// child class inherits from parent class
// GasCar class inherits from Vehicle class
// parent class reference variable can hold the child class object