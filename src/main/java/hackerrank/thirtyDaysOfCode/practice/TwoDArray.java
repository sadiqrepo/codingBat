package hackerrank.thirtyDaysOfCode.practice;

/**
 * Created by sadiq on 24/10/17.
 */
import java.io.*;
import java.util.*;

public class TwoDArray
{
    public static void main(String[] args)
    {
        int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        {
            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    a[i][j] = scanner.nextInt();
                    try {
                        if (i > 1 && j > 1) {
                            int sum =
                                    a[i][j]
                                            + a[i][j - 1]
                                            + a[i][j - 2]
                                            + a[i - 1][j - 1]
                                            + a[i - 2][j]
                                            + a[i - 2][j - 1]
                                            + a[i - 2][j - 2];
                            if (sum > maxSum) {
                                maxSum = sum;
                            }
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        e.getMessage();
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
