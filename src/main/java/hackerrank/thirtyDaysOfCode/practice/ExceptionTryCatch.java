package hackerrank.thirtyDaysOfCode.practice;



import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
import java.io.*;


/**
 * Created by sadiq on 16/10/17.
 */
public class ExceptionTryCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

            if (y == 0) throw new ArithmeticException("/ by zero");
            else System.out.println(x/y);

        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        }




    }



