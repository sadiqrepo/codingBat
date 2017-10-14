package hackerrank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by sadiq on 14/10/17.
 */
public class Day0 {
    public static void main(String args[]){

        // Create scanner object to read input from stdin.
        Scanner sc = new Scanner(System.in);

        // Read a full line of input from stdin and save it to the variable, inputString.
        String inputString = sc.nextLine();

        //Close the scanner object
        sc.close();

        //Print a literal string to the stdout, saying "Hello, World.
        System.out.println("Hello, World.");

        //Line of code to print the value read from stdin and stored in inputString variable.
        System.out.println(inputString);

    }
}
