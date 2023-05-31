package Review;

import java.util.Scanner;
public class Array_practice5 {
    public static void main(String[] args) {
        // There are array of size 5 that contains the country name. Get Input from the user and print them.

        String[] countries = new String[5];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 5 country names:");
        for (int i = 0; i < countries.length; i++) {
            countries[i] = keyboard

        }


        // Make another array that stores the capital city of each country and ask user to type in.
        // Make also another array that stores each country's GDP ranking and after that find the country with the
        //highest GDP
    }
}

