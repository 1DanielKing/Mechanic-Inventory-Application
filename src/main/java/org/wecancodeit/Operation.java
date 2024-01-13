package org.wecancodeit;

import java.util.Scanner;

public class Operation {
    public void choice(Garage garage) {
        Scanner input = new Scanner(System.in);
        int index;
        boolean purchased; // differentiate between purchase or store
        Vehicle currentVehicle; // vehicle "in hand"
        System.out.print("Press ENTER to continue. "); // prevent too much text from printing at once
        input.nextLine();
        System.out.print("\n\n\n\n");

        // //maintenanceInterval ----> incomplete :(
        // for (int i = 0; i % 5 == 0; i++){
        // }

        /* user options printed */
        System.out.println(
                "Please choose an action:\n1. Start the Vehicle\n2. Drive the Vehicle\n3. Know Max Speed of Vehicle\n4. Purchase Price of Vehicle\n5. Max Distance without stopping\n6. Sell The Vehicle\n7. Buy a Vehicle\n8. Store Vehicles in the garage\n9. Perform Maintenance on Vehicle\n10. List all vehicles in the garage.\n11. Exit application.");
        System.out.print(">>> Please enter the number corresponding to your desired action: ");
        String chosenAction = input.nextLine();
        switch (chosenAction) {
            case "1": // start vehicle case. prompts user to select a vehicle and then calls start
                      // which is a method of that object
                System.out.print(
                        "\nYou have chosen to start a vehicle. Please choose which vehicle would you like to start. (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error! A vehicle was not selected.");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                currentVehicle.start();
                break;

            case "2": // Drive the Vehicle case. prompts user to select a vehicle and then calls drive
                      // which is a method of that object
                System.out.print(
                        "\nYou have chosen to drive a vehicle. Please choose which vehicle would you like to drive. (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error! A vehicle was not selected.");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                currentVehicle.drive();
                break;

            case "3": // Know Max Speed of Vehicle case. prompts user to select a vehicle and then
                      // calls drive which is a method of that object
                System.out.println("Which vehicle's top speed would you like to know? (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error! A vehicle was not selected.");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                System.out.println(" The top speed of the " + currentVehicle.makeAndModel + " is "
                        + currentVehicle.topSpeed + ".");
                break;

            case "4": // Purchase Price of Vehicle case. prompts user to select a vehicle and then
                      // prints related variable of object
                System.out.println("Which vehicle's price would you like to know? (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error! A vehicle was not selected.");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                System.out.println(
                        " The top speed of the " + currentVehicle.makeAndModel + " is $" + currentVehicle.price + ".");
                break;

            case "5": // "Max Distance without stopping" prompts user to select a vehicle and then
                      // prints related variable of object
                System.out.println("Which vehicle's range would you like to know? (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error! A vehicle was not selected.");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                System.out.println(" The range at full of the " + currentVehicle.makeAndModel + "  is "
                        + currentVehicle.rangeAtFull + ".");
                break;

            case "6": // prompts user to select a vehicle and then calls a method of garage which
                      // returns index position of object, then removes it from the arraylist
                System.out.println("Which vehicle would you like to sell? (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error! A vehicle was not selected.");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                System.out.println("The car " + currentVehicle.makeAndModel + " was sold.");
                garage.carList.remove(index);
                break;

            case "7": // BUY - calls a method to have user enter values for variables which are
                      // combined to add a new object to the array list. prints out telling the user
                      // they 'BOUGHT' the car
                System.out.print("You have chosen to buy a car. (Press ENTER to continue)");
                input.nextLine();
                purchased = true;
                garage.addVehicle(purchased);
                break;

            case "8": // STORE - calls a method to have user enter values for variables which are
                      // combined to add a new object to the array list. prints out telling the user
                      // they 'STORED' the car
                System.out.println("You have chosen to store a vehicle. (Press ENTER to continue)");
                input.nextLine();
                purchased = false;
                garage.addVehicle(purchased);
                break;

            case "9": // Perform maintenance case. prompts user to select a vehicle and then calls
                      // maintenance which is a method of that vehicle object
                System.out.print(
                        "\nYou have chosen to perform maintenance on a vehicle. Please choose which vehicle would you like to perform maintenance on. (Press ENTER to continue) ");
                input.nextLine();
                index = garage.pickVehicle();
                if (index == -1) {
                    System.out.println("Entry error!");
                    break;
                }
                currentVehicle = garage.carList.get(index);
                currentVehicle.maintenance();

                // case "10": // get MPG of gas car INCOMPLETE :(
                // System.out.println("You have requested to know MPG of a gas car. Please
                // select a gas car from the list. Press ENTER to continue.");
                // input.nextLine();

            case "10": // calls method in garage which lists all vehicles. (this same method has been
                       // used in all prior cases also)
                System.out.print("\n");
                garage.listOfAllVehicle();

            case "11":
                System.out.println("You have elected to quit. Goodbye");
                System.exit(0);

            default: // error alert, loops this choice() of class Operation
                System.out.println("Error. Please check your entry and try again.");
                choice(garage);
        }

        System.out.print(
                "\nContinue using inventory application? Enter \"Y\" to continue, enter anything else to quit the app: ");
        // prompts user whether they want to continue using the application or quit.
        String entry = input.nextLine();
        if ((entry.equals("Y")) || (entry.equals("y"))) {
            choice(garage);
        } else {
            System.out.println("See you next time.");
            System.exit(0);
        }
    }
}