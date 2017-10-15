package hackerrank.thirtyDaysOfCode.practice;

import java.io.*;
import java.util.*;

/**
 * Created by sadiq on 15/10/17.
 */
public class EOF {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            // To read the input from stdin
            Scanner sc = new Scanner(System.in);

            int x = 1;

            while(sc.hasNextLine()){
                System.out.println(x +" "+sc.nextLine());
                x= x+1;
            }

            sc.close();

        }

}
