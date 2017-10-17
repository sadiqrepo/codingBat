package hackerrank.thirtyDaysOfCode.practice;

import java.util.Scanner;

/**
 * Created by sadiq on 16/10/17.
 */
public class Calculator {

    public static final My_Calculator my_calculator = new My_Calculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
