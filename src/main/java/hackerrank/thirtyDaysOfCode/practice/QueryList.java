package hackerrank.thirtyDaysOfCode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sadiq on 24/10/17.
 */
public class QueryList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try {
            List<Integer> queryList = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                queryList.add(in.nextInt());
            }

            int q = in.nextInt();
            for (int j = 0; j < q; j++) {
                String modifyList = in.next();
                if (modifyList.equalsIgnoreCase("Insert")) {

                    int x = in.nextInt();
                    int y = in.nextInt();
                    queryList.add(x, y);
                } else {
                    int x = in.nextInt();
                    queryList.remove(x);
                }

            }
            for(int k=0; k<queryList.size(); k++){
                System.out.print(queryList.get(k)+ " ");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
