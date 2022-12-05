package Basic;

public class operator {
    // operator: signs that performs calculation (ex: +, -, *, /)
    // operand: subject of operator (variable, constant, literal...)

    public static void main(String[] args) {
        int b = 20;
        int a = b + 10; // 30

        int x = 5;
        int y = x * 4 + 3;


        /*
        arithmetic operator: +, -, *, %, /
        comparison operator: <, >, <=, >=, ==(equals), !=(not equals)
        logical operator: && (AND), ||(OR), !(NOT)

         */

        //arithmetic operator
        int i = 5;
        i++;
        System.out.println(i);

        int j = 10;
        int k = 3;
        System.out.println(j/k);
        System.out.println(j%k);

        //comparison operator

        System.out.println(10 != 5);

        //logical operator

        int dongHanAge = 16;

        System.out.println(dongHanAge > 17 || dongHanAge < 15);

        // 2 4 6 8 10 / 3 6 9 12 15 18
        // multiple of 2 or 3 --> (num % 2 == 0 || num % 3 == 0)
    }

}
