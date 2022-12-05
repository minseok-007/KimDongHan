package Basic;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        //2000 --> 23
        //2010 --> 13
        //current year - the year born + 1
        // 2022 - 2022 + 1 = 1
        // 2022 - 2021 + 1 = 2

        Scanner keyboard = new Scanner(System.in);
        int yearBorn = keyboard.nextInt();
        System.out.println(2022 - yearBorn + 1);


    }
}
