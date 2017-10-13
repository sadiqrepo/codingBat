/**
 * Created by sadiq on 01/08/16.
 */
public class WordEnds {
    /**

    public static void main(String[] args) {

        String str = "XYcXY12";
        String word= "XYvvv";
        new WordEnds().wordEnd(str, word);
        //words.wordEnd(str, word);

    }

    public String wordEnd(String str, String word) {

        int slen = str.length();
        int wlen = word.length();
        String fin = "";

        for (int i = 0; i <= slen-wlen; i++) {
            String tmp = str.substring(i,i+wlen);

            if (i > 0 && tmp.equals(word))
                fin += str.charAt(i-1);

            if (i < slen-wlen && tmp.equals(word))
                fin += str.charAt(i+wlen);
        }
        System.out.println(fin);
        return fin;
    }
     */
}
