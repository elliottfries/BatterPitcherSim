/*
 * This is the Batter class
 */
package BatterPitcherSim;

/**
 *@author Elliott Fries
 */
public class Batter {

    private String name;
    private String position;
    private double average;

    /**
     * This is where the variables related to the batter are input into the program
     * to be saved
     * @param name
     * @param position
     * @param average 
     */
    Batter(String name, String position, double average) {
        this.name = name;
        this.position = position;
        this.average = average;
    }

    /**
     * This is where the program checks to see if the hit was successful
     * the result is returned to the driver and the result is printed out to
     * the user based on that result
     * @return 
     */
    public boolean hit() {
        boolean strike = true;
        double hitAvg = average * 100;
        int hitCheck = (int) (1 + Math.random() * 99);

        if (hitCheck >= hitAvg) {
            strike = false;
        }
        return strike;

    }

    /**
     * This method gets the name of the batter for the simulation and returns it
     * to the driver
     *
     * @return
     */
    public String getName() {
        return name;
    }

}
