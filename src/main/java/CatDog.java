/**
 * Created by sadiq on 17/07/16.
 */
public class CatDog {
    public static void main(String args[]){
        catDog("cotDag");
    }


    public static boolean catDog(String str) {
        int catCount=0;
        int dogCount=0;
        for(int i=0; i<str.length()-2;i++){
            if(str.charAt(i)=='c' && str.charAt(i+2)=='t' ){
                catCount++;
            }else if(str.charAt(i)=='d' && str.charAt(i+2)=='g'){
                dogCount++;
            }
        }if(catCount==dogCount){
            return true;
        }
        return false;
    }
}
