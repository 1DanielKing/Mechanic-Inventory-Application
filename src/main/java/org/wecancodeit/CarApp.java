// WARNING: APPLICATION MAY FAIL IF A USER ENTERS ANY PARAMETERS INCORRECTLY. WILL WORK TO IMPLEMENT EXCEPTION HANDING LATER.

package org.wecancodeit;

public class CarApp {
    public static void main(String[] args) {
        Operation userAction = new Operation();
        Garage garage = new Garage();
        // user entry point, calls operation because the teacher (*the boss*) said to do it this way
        System.out.println("\n-------------------------\nWelcome to the garage.");
        userAction.choice(garage);
    }
}