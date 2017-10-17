package hackerrank.thirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by sadiq on 16/10/17.
 */
public class Day3 {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n >= 1 && n <= 100) {
            if (n % 2 == 1 || ((n >= 6 && n <= 20) && n % 2 == 0)) {
                ans = "Weird";
            } else {
                // Complete the code
                ans = "Not Weird";
            }
            System.out.println(ans);
        }
    }
}

