/**
 * Created by sadiq on 17/07/16.
 */
public class MakeChocolates {


    public static void main(String args[]){
        makeChocolate(3,1,9);
    }

    public static int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (big > maxBig)
            return (goal <= 5 * maxBig + small) ? (goal - 5 * maxBig) : -1;
        return (goal <= 5 * big + small) ? (goal - 5 * big) : -1;
    }
}
