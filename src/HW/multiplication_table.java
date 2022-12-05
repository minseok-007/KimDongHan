package HW;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int i = 1; i <=9; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }

        /*

        2x1=2
        2x2=4
        2x3=6
        2x4=8
        ...
        2x9=18
         */
    }
}
