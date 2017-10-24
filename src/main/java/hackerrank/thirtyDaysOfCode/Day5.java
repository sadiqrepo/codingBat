package hackerrank.thirtyDaysOfCode;

/**
 * Created by sadiq on 20/10/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product;

        for(int i =1; i <=10; i++){
            product = n * i;
            System.out.println(n +" x "+i +" = "+ product);
        }

    }
}
