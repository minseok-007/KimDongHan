package HW;

import java.util.Scanner;

public class avg_val {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <10; i++) {
            Scanner keyboard = new Scanner (System.in);
            int num = keyboard.nextInt();
            sum+=num;
        }
        System.out.println(sum/10);
    }
}
