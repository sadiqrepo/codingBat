package hackerrank.thirtyDaysOfCode;

/**
 * Created by sadiq on 20/10/17.
 */
import java.io.*;
import java.util.*;

public class Day6 {


    public static void main(String[] args) {

        //Read input from the console

        try{
            Scanner in = new Scanner(System.in);
            int noOfLines = Integer.parseInt(in.nextLine());

            String [] input = new String[noOfLines];

            for (int i = 0; i <= noOfLines; i++){
                input[i] = in.nextLine();

                // Creating an array of type String to store the words provided in each line.
                char [] myCharArray = input[i].toCharArray();
                for(int j = 0; j < input[i].length(); j+=2){
                    // Print each sequential character on the same line
                    System.out.print(myCharArray[j]);
                }
                System.out.print(" ");
                for(int k = 1; k < input[i].length(); k+=2){
                    // Print each sequential character on the same line
                    System.out.print(myCharArray[k]);
                }
                System.out.println();
            }
        }catch (NoSuchElementException e){
            e.getMessage();
        }



    }
}
