package Basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in); // Scanner 변수 = new Scanner(System.in);

        int input = keyboard.nextInt(); // int 변수 = 변수.nextInt();
        String input2 = keyboard.next();

        System.out.println(input);
        System.out.println(input2);

    }
}
