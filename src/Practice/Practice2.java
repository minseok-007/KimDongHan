package Practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // Input two numbers with space 5 times (first number is A's number and second number is B's number).
        // Count each time whose number is higher, and output who has more score, thereby solving for final winner.
        // Final Output should look like: A won x times, and B won y times, so final Winner is A (or B).
        Scanner scanner = new Scanner(System.in);
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter two numbers separated by a space: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                aScore++;
            } else if (b > a) {
                bScore++;
            }
        }
        if(aScore > bScore) {
            System.out.println("A won" + aScore + "times, and B won" + bScore + "times so the final winner is A.");
        } else if(bScore > aScore) {
            System.out.println("B won" + bScore + "time, and A won" + aScore + "times so the final winner is B.");

        } else {
            System.out.println("A and B tied");
        }
    }
}

// 1 2
// 3 4
// 4 7
// 5 8
// 6 4