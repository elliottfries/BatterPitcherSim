/*
 * Project 4 for CS1180
 * This Project is meant to demonstrate understanding of classes and object
 * oriented programming
 */
package BatterPitcherSim;

/**
 * @author Elliott Fries
 */
public class BatterPitcherSim {

    /**
     * In the main method, the initialization of the class is done a loop with
     * two for loops runs the simulation based on the averages of the pitcher
     * and the batter a count of both strikes and balls thrown outside the
     * strike zone are kept track
     */
    public static void main(String[] args) {
        

        //you can change the name, position, and average of a player here
        Batter batPlayer = new Batter("Joe Ferro", "Batter", 0.50);
        Pitcher pitchPlayer = new Pitcher("Elliott Fries", "Pitcher", 0.79);

       
        String pitchName = pitchPlayer.getName();
        String batName = batPlayer.getName();

        int strikeCount = 0;
        int ballCount = 0;

        //The beginning of the simulation.
        System.out.println(pitchName + " is pitching to " + batName);
        
        //This for loop is used to determine the result of the pitcher's throw
        for (int j = 0; j < 10; j++) {
            boolean pitchResult = pitchPlayer.pitch();
            if (pitchResult == true) {
                
                //This for loop determines the result of the batter's swing
                for (int i = 0; i < 10; i++) {

                    boolean hit = batPlayer.hit();
                    if (hit == true) {
                        System.out.println(batName + " got a hit!");
                        return;
                    }
                    if (strikeCount == 3) {

                        System.out.println(batName + " has struck out");
                        return;
                    } else {
                        System.out.println(batName + " swung and missed");
                        strikeCount++;
                    }

                    System.out.println("The count is " + ballCount + " balls and "
                            + strikeCount + " strikes");

                }
            }
            if (ballCount == 4) {

                System.out.println(batName + " has walked");
                return;

            } else {
                System.out.println(pitchName + " threw a ball");
                ballCount++;
                System.out.println("The count is " + ballCount + " balls and "
                        + strikeCount + " strikes");
            }

        }

    }

}
