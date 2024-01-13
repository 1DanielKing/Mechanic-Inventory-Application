# Mechanic Inventory Application
The concept of this application is for a mechanic's workshop to be able to inventory and assess data on vehicles in their possession, as well as buy, sell, add, or remove vehicles.
This application concept is designed to show use of principles including abstraction, inheritance, polymorphism, string entry interface, testing, primitive and object data types, and project organization.


## different types of cars set up as unique classes which extend Superclass Vehicles
1. Electric Vehicles (EVs)
2. Artificial Intelligence (AI) cars
3. Internal Combustion (gas) cars 


## Switch/Case which takes user entry to choose an action.
1. Start the Vehicle
2. Drive the Vehicle
3. Know Max Speed of Vehicle
4. Purchase Price of Vehicle
5. Max Distance without stopping
6. Sell The Vehicle
7. Buy a Vehicle
8. Store Vehicles in the garage
9. Perform Maintenance on Vehicle
10. List all vehicles in the garage.
11. Exit application.

**CarApp.java:** The entry point of the program where you'll interact with the Garage class and manage different types of cars.

**Vehicle.java:** An abstract class serving as the base class for all vehicle types (Car, ElectricVehicle, and AICar). It includes shared properties and methods.

**Car.java:** A class representing regular cars, inheriting from the Vehicle class.

**ElectricVehicle.java:** A class representing Electric Vehicles (EVs), also inheriting from the Vehicle class.

**AICar.java:** A class representing Artificial Intelligence (AI) cars, inheriting from the Vehicle class.

**Garage.java:** The class that represents the garage. It manages a collection of vehicles of various types and provides methods for adding, removing, and listing these vehicles.

**Operation.java** The class that allows the user to interact with the Garage.java, through a user interface.
