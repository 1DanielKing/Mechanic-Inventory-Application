/*
 * The class that represents the garage. It manages a 
 * collection of vehicles of various types and provides 
 * methods for adding, removing, and listing these vehicles.
 */

package org.wecancodeit;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    ArrayList<Vehicle> carList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public Garage() {
        /*
         * constructor of default vehicles added below for usability of application next
         * 10 lines
         */
        Vehicle tesla = new EVCar(10_000, 100, 400, 2022, "Tesla Model Y", "T3301");
        Vehicle tesla2 = new EVCar(80000, 150, 50, 2020, "Tesla Model X", "T3302");
        Vehicle rivian = new AICar(35000, 1, 50, 2019, "Rivian RivCar", "RIV02");
        Vehicle chevy = new GasCar(10000, 110, 400, 2010, "Chevy Cruze", "1G1FB");
        carList.add(chevy);
        carList.add(rivian);
        carList.add(tesla);
        carList.add(tesla2);
    }

    /*
     * initial method called to provide vehicle object index location from array
     * list
     */
    public int pickVehicle() {
        System.out.println("\nHere are the vehicles currently present in the garage.");
        listOfAllVehicle();
        System.out.print("Which vehicle would you like to select? Enter VIN (*case sensitive*): ");
        String chosenVin = input.nextLine();
        int location = chosenVehicle(chosenVin);
        if (location == -1) {
            System.out.print(
                    "Incorrect entry. Check the list to see if the vehicle is already absent and try again. ");
        }
        return location;
    }

    /*
     * method checks String chosenVin which is passed by pickVehicle to loop through
     * ArrayList
     * and match String to correct Vehicle object and provide index location
     */
    public int chosenVehicle(String chosenVin) {
        int location = -1;
        if (chosenVin.length() != 5) { // this can be activated to make sure that entries are proper number of
            // characters and prevent unnecessary checking of array data. also includes a
            // line down below
            return location;
        }
        // matches String of input entered by user
        for (int i = 0; i < carList.size(); i++) {
            Vehicle v = carList.get(i);
            if (v.vin.equals(chosenVin)) {
                location = i;
                break;
            }
        }
        return location;
    }

    public void addVehicle(boolean purchased) {
        System.out.print(
                "Please enter the car details. What type of car? \"EVCar\", \"AICar\", or \"GasCar?\" (ENTER CASE TO MATCH EXACTLY)\n");
        String type = input.nextLine();
        System.out.print("Enter price (NUMBERS ONLY): ");
        int price = input.nextInt();
        System.out.print("Enter top speed. (NUMBERS ONLY): ");
        int topSpeed = input.nextInt();
        System.out.print("Enter range at full. (NUMBERS ONLY): ");
        int rangeAtFull = input.nextInt();
        System.out.print("Enter the year of the vehicle. (NUMBERS ONLY): ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter the make and model of the vehicle: ");
        String makeAndModel = input.nextLine();
        System.out.print("Enter the first 5 characters of the VIN: ");
        String vin = input.nextLine();
        if (type.equals("EVCar")) {
            Vehicle newEV = new EVCar(price, topSpeed, rangeAtFull, year, makeAndModel, vin);
            carList.add(newEV);
        }
        if (type.equals("AICar")) {
            Vehicle newAI = new EVCar(price, topSpeed, rangeAtFull, year, makeAndModel, vin);
            carList.add(newAI);
        }
        if (type.equals("GasCar")) {
            Vehicle newGC = new GasCar(price, topSpeed, rangeAtFull, year, makeAndModel, vin);
            carList.add(newGC);
        } 
        if (purchased == true) { // differentiate between [purchase] or store
            System.out.println("You purchased the " + makeAndModel + "!");
        }
        if (purchased != true) { // differentiate between purchase or [store]
            System.out.println("You stored the " + makeAndModel + ".");
        }
        return;

    }

    public void addVehicleB(Vehicle addedCar) {
        carList.add(addedCar);
    }

    /*
     * Method to remove vehicle from list.
     * 
     * @param removeVehicle Lists vehicles and allows user to enter vin to identify
     * which vehicle they would like to remove. Also allows user to cancel (escape
     * the method) or re-try.
     */
    public void removeVehicle() {
        for (Vehicle vehicle : carList) {
            System.out.println(vehicle.makeAndModel + " " + vehicle.vin + ".");
        }
        System.out.print("Which vehicle would you like to remove? Enter VIN (*case sensitive*): ");
        String vin = input.nextLine();
        int location = -1;
        // checks user entry to find Vehicle class object in array with String vin that
        // matches String of input entered by user
        if (vin.length() != 5) { // this can be activated to make sure that entries are proper number of
                                 // characters and prevent unnecessary checking of array data. also includes a
                                 // line down below
            System.out.println("Entry format incorrect. Please check that format is 5 characters long.");
            return;
        }
        for (int i = 0; i < carList.size(); i++) {
            Vehicle v = carList.get(i);
            if (v.vin.equals(vin)) {
                location = i;
                break;
            }
        }
        if (location == -1) {
            System.out.print(
                    "Incorrect entry. Check the list to see if the vehicle is already absent and try again. ");
            return;
        }
        carList.remove(location);

    }

    public void listOfAllVehicle() {
        System.out.println("Current Vehicles in system are:");
        // heading of columns and then loop print of data
        System.out.printf("%-10s%-25s%-15s%-15s%-10s%-10s\n\n", "Year", "Make and Model", "Price", "Top Speed", "Range",
                "VIN");
        for (int i = 0; i < carList.size(); i++) {
            Vehicle v = carList.get(i);
            System.out.printf("%-10s%-25s%-15s%-15s%-10s%-10s\n", v.year, v.makeAndModel, v.price, v.topSpeed,
                    v.rangeAtFull, v.vin);
        }
    }

}
