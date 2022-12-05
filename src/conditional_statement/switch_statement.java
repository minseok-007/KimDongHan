package conditional_statement;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        int month = 0;
        System.out.println("Type the current month");

        Scanner keyboard = new Scanner(System.in);
        month = keyboard.nextInt();

        //We want to find out what season is the month you typed.
        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Currently it is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Currently it is summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Currently it is autumn");
                break;
            case 12: case 1: case 2:
                System.out.println("Currently it is winter");
        }

    }
}
