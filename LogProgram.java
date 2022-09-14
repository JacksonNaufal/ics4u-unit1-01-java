/*
* The Log  program implements an application that
* simply displays takes an input and displays the
* amount of logs that can fit in a truck.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-01-01
*
* This is the log calculator  program.
*/

import java.util.Scanner;

/**
 * This is a log calculating program.
 */

final class LogProgram {

    /**
    * This is the weight per log.
    */
    public static final double LBS = 20;

    /**
    * This is the max capacity in the truck.
    */
    public static final double CAP = 1100;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private LogProgram() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // print out "Log Capacity!"
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter log length of logs: ");
        final float log = myObj.nextFloat();
        System.out.println("Number of log is: " + CAP / (log * LBS));
        System.out.println("\nDone.");
    }
}

