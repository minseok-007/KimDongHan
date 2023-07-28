package Practice;

import java.util.Scanner;



public class Pratice1 {
    // Wirte a code that inputs the name of each student and find the longest name.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String [] names = new String[5];

        System.out.println("Enter 5 student names :");


        for(int i=0; i < 5; i++){
            names[i] = keyboard.nextLine();
        }
        int max = names[0].length();

        for(int i=0; i < 5; i++){
            if (max < names[i].length()){
                max = names[i].length();

            }
        }

        System.out.println("The Longest Names is " + LongestName);

    }
}
