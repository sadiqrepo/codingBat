

import java.io.*;
import java.util.*;

/**
 * Created by sadiq on 13/10/17.
 */


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int result;
        for(int i=1; i<=10; i++){
            result = N * i;
            System.out.println(" 2 * " +i+ " = " +result);
        }
    }
}
