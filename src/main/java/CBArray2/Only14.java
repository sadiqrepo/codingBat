package CBArray2;

import java.util.Scanner;

/**
 * Created by sadiq on 04/11/17.
 */
public class Only14 {
    public static void main(String[] args){
        //int[] array1 = {1,4,2,4};
        //int arrayLength = array1.length;
        Scanner s = new Scanner(System.in);
       // System.out.println("Enter the array");
        int n = s.nextInt();
        int[] array1 = new int[n];
        s.nextLine();
        //System.out.println("Read array elements from console");
        for(int i=0; i<n;i++){
            array1[i] = s.nextInt();
        }
        System.out.println(Only14.only14(array1));
    }

    public static boolean only14(int[] nums){
        int flag = 0;
        for(int i =0; i<nums.length; i++){
            if( (nums[i] == 1) || (nums[i]==4)){
                flag = 0;
            } else {flag =1; break;}
        }if(flag != 0) return false;
        else return true;
    }
}
