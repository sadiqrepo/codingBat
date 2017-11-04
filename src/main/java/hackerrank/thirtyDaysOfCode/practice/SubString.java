package hackerrank.thirtyDaysOfCode.practice;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



/**
 * Created by sadiq on 30/10/17.
 */

/* Find Lexicographically smallest & Largest string */

public class SubString {


    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String min="",max="";
        int k=in.nextInt();
        int l=s.length();
        for(int i=0;i<l-k+1;i++)
        {
            String ss="";
            for(int j=i;j<i+k;j++)
                ss+=s.charAt(j);
            if(i==0)
            {
                min=ss;
                max=ss;
            }
            else
            {
                if(ss.compareTo(min)<0)
                    min=ss;
                if(ss.compareTo(max)>0)
                    max=ss;
            }

        }
        System.out.println(min);
        System.out.println(max);
    }

}
