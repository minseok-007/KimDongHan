package Review;

import java.util.Scanner;

public class /**/If_statements {
    // Write a Java program to get a number from the user and print whether it is positive or negative.

    public static void main(String[] args) {
        /*
        Scanner keyboard  = new Scanner(System.in);

        int input = keyboard.nextInt();

        if (input > 0) {
            System.out.println("The number is positive");
        }

        else if (input < 0){
            System.out.println("The number is negative");
        }

        else{
            System.out.println("The number is zero");
        }

         */


        // Write a program in Java to print the Floyd's Triangle

        /*
        Input number of rows: 5
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */

        //Scanner, println

        /*

        Scanner keyboard  = new Scanner(System.in);
        int input = keyboard.nextInt();
        int num = 1;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }


         */

        // Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.


        
        // 2 x 1 = 2
        // 2 x 2 = 4

        /*
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + "x" + i + "=" + num*i );
        }

         */

        //Write a program that prompts the user to input an integer and
        // then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

        /*
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt(); //

        //54321
        int rev_num = 0;

        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }

         */

        // Given the number from the console, find the number of its factors!

        /*
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println(count);

         */

        //Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average of all numbers.


        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        int sum = 0;
        double average = 0;
        int count = 0;

        while(!choice.equals("q")) {
            System.out.println("Press q to quit");
            choice = keyboard.next(); //"3" --> 3

            if (!choice.equals("q")) {
                int number = Integer.parseInt(choice);
                sum += number;
                count++;
            }
        }

        System.out.println(sum / count);





    }

}