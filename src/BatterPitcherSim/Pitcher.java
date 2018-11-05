/*
 * This is the Pitcher class
 */
package BatterPitcherSim;

/**
 *@author Elliott Fries
 */
public class Pitcher {

    private String name;
    private String position;
    private double strikeAverage;

    /**
     * This is where the variables related to the pitcher are input into the program
     * to be saved
     * @param name
     * @param position
     * @param strikeAverage 
     */
    Pitcher(String name, String position, double strikeAverage) {
        this.name = name;
        this.position = position;
        this.strikeAverage = strikeAverage;

    }

    /**
     * This is where the program checks to see if the throw was successful
     * the result is returned to the driver and the result is printed out to
     * the user based on that result
     * @return 
     */
    public boolean pitch() {
        boolean ball = true;
        double pitchAvg = strikeAverage * 100;

        int pitchCheck = (int) (1 + Math.random() * 99);
        if (pitchCheck >= pitchAvg) {
            ball = false;
        } else {
            ball = true;
        }
        return ball;

    }

    /**
     * This method gets the name of the pitcher for the simulation and returns it
     * to the driver
     * @return 
     */
    public String getName() {
        return name;

    }

}
