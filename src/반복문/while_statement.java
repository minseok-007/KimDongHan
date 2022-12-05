package 반복문;

import java.util.Scanner;

public class while_statement {
    /*
    while (condition) {
        While the "condition" is true, the sentence in the curly bracket is repeated!
    }
     */

    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /*
        int i = 1;

        while(i <= 10) {
            System.out.println(i);
        }


         */

        /*
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner keyboard = new Scanner(System.in);
            int input = keyboard.nextInt();
            sum += input;
        }

        System.out.println(sum);

         */


        int sum = 0;
        boolean a = true;

        System.out.println("Input the number you want to add. If you want to finish, type 0");

        while(a) {
            Scanner keyboard = new Scanner(System.in);
            int num = keyboard.nextInt();

            if (num!=0) { //!= not equals
                sum += num;
            } else {
                a = false;
            }
        }

        System.out.println(sum);
    }
}
