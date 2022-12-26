package oop;

public class method {

    /*
        반환타입 메서드이름 (매개변수) {
            메서드 body
        }
     */
    static int add (int x, int y) {
        int result = x + y;
        return result;
    }

    static double add(double x, double y) {
        double result = x + y;
        return result;
    }



    public static void main(String[] args) {
        int sum = add(5,3);
        double sum2 = add(4.7, 3.6);
        System.out.println(sum);
        System.out.println(sum2);

    }
}
