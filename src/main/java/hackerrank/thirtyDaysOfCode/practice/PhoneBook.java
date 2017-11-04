package hackerrank.thirtyDaysOfCode.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sadiq on 24/10/17.
 */
public class PhoneBook {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            in.nextLine();

            /**Here map is chosen as preferred Data Structure, to store the Key, Value pairs.
             * Also, HashMap is chosen as there is no order that needs to be maintained.
             * Constructing an empty <tt>HashMap</tt> with the default initial capacity
             * (16) and the default load factor (0.75).
             */

            Map<String, Integer> phoneBook = new HashMap<>();

            /** Adding the Key Name and value Phone to the HashMap created
             * Using the put command
             */
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                phoneBook.put(name, phone);
                in.nextLine();

            }
            /** Condition to check whether the next token exists
             * or not.
             */

            while (in.hasNext()) {
                String s = in.nextLine();
                if (phoneBook.containsKey(s)) {
                    System.out.println(s + "=" + phoneBook.get(s));
                } else System.out.println("Not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
