package Basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        int input = keyboard.nextInt();
        String input2 = keyboard.next();

        System.out.println(input);
        System.out.println(input2);

    }
}
