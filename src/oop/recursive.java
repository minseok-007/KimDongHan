package oop;

public class recursive { // 나중에
    //recursive call: inside the method, the method call itself

    //3! = 3x2x1  1! = 1  0! = 1

    static int factorial(int n) {
        int result = 0;

        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }
        return result;
    }
}
