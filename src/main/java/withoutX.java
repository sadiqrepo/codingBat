/**
 * Created by sadiq on 25/06/16.
 */
public class withoutX {
    public static void main(String args[]){

        String str = "hippo";
        withoutXX(str);
    }

    public static String withoutXX(String str) {
        if(str.length()>1 && (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')){
            return str.substring(1, str.length()-1);
        } else if(str.length()== 0 || (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')){
            return "";
        } else if(str.length()>1 && (str.charAt(0) == 'x' && str.charAt(str.length()-1) !='x')){
            return str.substring(1);
        } else if(str.length()>1 && (str.charAt(str.length()-1) == 'x' )){
            return str.substring(0, str.length()-1);
        }
        return str;
    }
}
