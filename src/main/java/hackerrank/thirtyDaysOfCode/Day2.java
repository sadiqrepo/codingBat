package hackerrank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by sadiq on 15/10/17.
 */
public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        //Calculate tip cost
        double tipCost = mealCost * (tipPercent / 100.00);

        //Calculate tax cost
        double taxCost = mealCost * (taxPercent / 100.00);

        //Calculate totalCostAfterTipAndTax

        double totalCostAfterTipAndTax = mealCost + tipCost + taxCost;


        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalCostAfterTipAndTax);

        // Print your result

        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}
