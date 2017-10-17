package hackerrank.thirtyDaysOfCode.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by sadiq on 16/10/17.
 */
public class CurrencyFormatter {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.


        if(payment>=0 && payment<=(Math.pow(10,9))) {

            //US Locale
            Locale localeUS = new Locale("en", "US");
            NumberFormat currencyFormatUS = NumberFormat.getCurrencyInstance(localeUS);
            String us = currencyFormatUS.format(payment);

            //India Locale
            Locale localeIN = new Locale("en", "IN");
            NumberFormat currencyFormatIN = NumberFormat.getCurrencyInstance(localeIN);
            String india = currencyFormatIN.format(payment);


            //China Locale
            Locale localeCN = new Locale("zh", "CN");
            NumberFormat currencyFormatCN = NumberFormat.getCurrencyInstance(localeCN);
            String china = currencyFormatCN.format(payment);


            //France Locale
            Locale localeFR = new Locale("fr", "FR");
            NumberFormat currencyFormatFR = NumberFormat.getCurrencyInstance(localeFR);
            String france = currencyFormatFR.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }




    }


}
