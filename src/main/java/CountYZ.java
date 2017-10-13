import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by sadiq on 14/12/16.
 */
public class CountYZ {

    public static void main(String args[]) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = in.readLine();
            CountYZ cyz = new CountYZ();
            System.out.println(cyz.countYZ(s));
        }catch (Exception ex){
            ex.getStackTrace();
        }




    }

    public int countYZ(String str) {
        int length = str.length();
        String str1 = str.toLowerCase();
        char ch[] = str1.toCharArray();

        int count=0;
        for(int i=0; i<str1.length()-1; i++)
        {
            if(!Character.isLetter(ch[i+1]) )
            //if((str1.charAt(i)=='y' || str1.charAt(i)=='z') && (!Character.isLetter(str1.charAt(i+1))))
            {
                if((ch[i]=='y'||ch[i]=='z'))

                    count++;
            }

        }

        if((str1.charAt(str1.length()-1)=='y' ||  str1.charAt(str1.length()-1)=='z'))
        {
            count++;
        }
        return count;
    }


}
