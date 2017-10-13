import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sadiq on 15/12/16.
 */
public class EqualIsNot  {


    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for(int i=0; i< str.length()-2; i++)
        {
            if(str.charAt(i)=='i' && str.charAt(i+1)=='s'){
                isCount++;
            }
        }
        for(int i=0; i<str.length()-3; i++)
        {
            if(str.substring(i,i+3).equals("not"))
            {
                notCount++;
            }
        }
        if(isCount == notCount)
            return true;
        else return false;
    }

}
