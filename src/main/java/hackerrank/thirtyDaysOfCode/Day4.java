package hackerrank.thirtyDaysOfCode;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by sadiq on 17/10/17.
 */
public class Day4 {

    private int age;

    public Day4(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge<0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");

        }else {
            this.age = initialAge;
        }

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if(this.age < 13){
            System.out.println("You are young.");
        } else if(this.age >=13 && this.age<18){
            System.out.println("You are a teenager.");
        } else
        System.out.println("You are old.");
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4 p = new Day4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

    /**
     * Created by sadiq on 19/10/17.
     */
    public static class Day6 {

        public static void main(String[] args) throws Exception{


            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                //Read input from the console
                Scanner in = new Scanner(System.in);
                //int noOfLines = Integer.parseInt(br.readLine());
                int noOfLines = Integer.parseInt(in.nextLine());

                String[] input = new String[noOfLines];

                for (int i = 0; i <= noOfLines; i++) {

                    //System.out.println("Word "+(i+1));
                    //input[i] = br.readLine();
                    input[i] = in.nextLine();

                    // Creating an array of type String to store the words provided in each line.

                    char[] myCharArray = input[i].toCharArray();
                    for (int j = 0; j < input[i].length(); j += 2) {
                        // Print each sequential character on the same line
                        System.out.print(myCharArray[j]);
                    }
                    System.out.print(" ");
                    for (int k = 1; k < input[i].length(); k += 2) {
                        // Print each sequential character on the same line
                        System.out.print(myCharArray[k]);
                    }
                    System.out.println();
                }
            }catch (NoSuchElementException e){
                e.getMessage();
            }



        }
    }
}
