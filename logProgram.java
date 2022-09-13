/*
* The HelloWorld program implements an application that
 * simply displays "Hello World!" to the standard output.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-01-01
*/

/**
* This is the standard "Hello, World!" program.
*/

import java.util.Scanner;

final class logProgram {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private logProgram() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // print out "Hello, World!"
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Weight of logs!");
        float logProgram  = myObj.nextFloat();  // Read user input
        System.out.println("The amount of logs is:"  + 1100 / (logProgram * 20));  // Output user input
        System.out.println("\nDone.");
    }
}

