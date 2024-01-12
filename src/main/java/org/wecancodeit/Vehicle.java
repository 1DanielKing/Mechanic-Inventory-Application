/** An abstract class serving as the base class for all vehicle types (Car, ElectricVehicle, and AICar). It includes shared properties and methods.
 */

package org.wecancodeit;

public abstract class Vehicle {

    // properties shared by all

    int price;
    int topSpeed;
    int rangeAtFull;
    int year;
    String makeAndModel;
    String vin;
    int interval;

    // this is a constructor
    public Vehicle(int price, int topSpeed, int rangeAtFull, int year, String makeAndModel, String vin) {
        this.price = price;
        this.topSpeed = topSpeed;
        this.rangeAtFull = rangeAtFull;
        this.year = year;
        this.makeAndModel = makeAndModel;
        this.vin = vin;
    }

    //abstract methods to be used by all types of cars
    public abstract void start();

    public abstract void stop();

    public abstract void drive();

    public abstract void maintenance();



}
