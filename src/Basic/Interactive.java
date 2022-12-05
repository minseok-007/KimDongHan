package Basic;

import java.util.Scanner;

public class Interactive {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        System.out.println(age + 10);
    }
}
