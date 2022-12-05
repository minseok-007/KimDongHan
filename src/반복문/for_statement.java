package 반복문;

public class for_statement {
    public static void main(String[] args) {
        /*
        for (initialize; conditional statement; increase  / decrease) {
        }
         */

        for (int i = 0; i<5; i++) {
            System.out.println("Hello DongHan");
        }


        //initialize --> conditional statement --> (perform --> inc/dec --> conditional statement) --> perform --> inc/dec
        int sum = 0;
        for (int i = 1; i<=11; i++) {
            sum += i; //sum = sum + i; sum == 1+2+3+4+5+6+7+8+9+10 = 55
        }
        int x = 1;
        //x = x + 1 --> x == 2
        System.out.println(sum);

        /*

        *****
        *****
        *****
        *****
        *****

        System.out.print();
        System.out.println();
         */


        for (int i = 1; i<=5; i++) { //i = 3, j =
            for (int j = 1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
