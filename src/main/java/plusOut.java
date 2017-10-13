/**
 * Created by sadiq on 30/07/16.
 */
public class plusOut {

    public static void main(String[] args) {

        String str = "12xy34";
        String word= "xy";
        new plusOut().plusMask(str, word);

    }

    public String plusMask(String str, String word) {
        int sLen = str.length();
        int wLen = word.length();
        String res = "";
        int found = str.indexOf(word);

        for (int i = 0; i < sLen; i++) {
            if (i == found) {
                res += word;
                found = str.indexOf(word, found + wLen);
                i += wLen-1;
            } else {
                res += "+";
            }
        }
        System.out.println(res);
        return res;
    }
}
