package hackerrank.thirtyDaysOfCode.practice;

import java.util.Scanner;

/**
 * Created by sadiq on 16/10/17.
 */
public class staticBlockExample {

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;



    static {
        sc.close();

        try {

            if (B <= 0 || H <= 0)
                flag = false;
            throw new Exception("Breadth and height must be positive");
        }catch (Exception e){
            System.out.println(e);
        }


    }




    public static void main(String args[]){

        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
