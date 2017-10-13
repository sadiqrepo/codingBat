/**
 * Created by sadiq on 23/06/16.
 */
public class startWord {
    public static void main(String args[]){

        String str = "hippo";
        String word = "hi";


        startWord(str, word);
    }

    public static String startWord(String str, String word) {

        if(str.contains(word)&& word.length()!=1)
            return word;
        if(str.length()<word.length())
            return"";
        if(word.length()==1 && str.length()==1)
            return str;
        if(word.length()==1 && word.contains(str.substring(1,1)))
            return str.substring(0,1);

        if(str.contains(word.substring(1,word.length())))
            return str.substring(0,word.length());

        else
            return "";
    }
}
