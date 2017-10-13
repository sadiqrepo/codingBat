import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by sadiq on 25/07/16.
 */
public class ZipZap {

    public static void main(String args[]) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
             s = in.readLine();
            System.out.println(zipZap(s));
        }catch (Exception ex){
            ex.getStackTrace();
        }




    }

    public static String zipZap(String str) {
        for (int i = 0; i < str.length()-2; i++)
            if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p')
                str = str.substring(0,i+1) + str.substring(i+2);
        return str;
    }

}
