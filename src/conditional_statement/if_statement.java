package conditional_statement;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        /*
        if (conditional statement) {

        }
         */

        /*
        int score = 50;

        if (score > 60) {
            System.out.println("You passed the exam!");
        }

         */

        System.out.println("Input your age");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();


        if (input == 0) {
            System.out.print("You typed zero. Please type again");
        }

        if (input!=0) {
            System.out.println("Your age is " + input);
        }



        if (input == 0) {
            System.out.print("You typed zero. Please type again");
        } else {
            System.out.println("Your age is " + input);
        }

        /*
        if (conditional statement) {
            Perform this line if the conditional statement is true
        } else {
            Perform this line if the conditional statement is false
        }
         */

        /*
        if (conditional statement 1) {
            //Perform this line if the con 1 is true
        } else if (conditional statement 2) {
            // Perform this if the con2 is true
        } else if (conditional statement 3) {
            // Perform this if con3 is true
        } else {
            Perform this if none of the above is true
        }
         */

        // 90이상- A, 80이상- B, 70이상 - C

        int score = 99;
        char grade = ' '; // character
        char option = ' ';
        if (score >=90) {
            grade = 'A';
            if (score >=98) {
                option = '+';
            } else if (score<94) {
                option = '-';
            }
        } else if (score >=80) {
            grade = 'B';
            if (score >=88) {
                option = '+';
            } else if (score<84) {
                option = '-';
            }
        } else if (score >=70) {
            grade = 'C';
        } else if (score>=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
}
