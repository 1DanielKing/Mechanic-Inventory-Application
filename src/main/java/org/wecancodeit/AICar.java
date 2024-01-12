/*
 * A class representing Artificial Intelligence 
 * (AI) cars, inheriting from the Vehicle class.
 */

package org.wecancodeit;

public class AICar extends Vehicle{
    private int batteryPercentage;
    private int interval = 2;

    private String utilityString = "The vehicle " + year + " " + makeAndModel + " ";

    public AICar(int price, int topSpeed, int rangeAtFull, int year, String makeAndModel, String vin){
        super(price, topSpeed, rangeAtFull, year, makeAndModel, vin);
    }
    
    @Override
    public void start() {
        System.out.println(utilityString + "has started.");
    }

    @Override
    public void stop() {
        System.out.println(utilityString + "has stopped.");
    }

    @Override
    public void drive() {
        System.out.println(utilityString + "is being driven.");
    }

    @Override
    public void maintenance() {
        System.out.println("Maintenance was completed on "+ utilityString.substring(0,1).toLowerCase() + utilityString.substring(1,utilityString.length()-1) +".");
    }

}


