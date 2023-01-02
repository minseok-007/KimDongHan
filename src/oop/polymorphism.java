package oop;

public class polymorphism {
    //Polymorphism: The condition of occurring in several different forms
    //  1. Overloading: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 오버로딩
    //     - 메서드의 이름이 같아야 한다.
    //     - parameter 의 개수 또는 타입이 달라야 한다.
    //  2. Overriding:

    int add(int a, int b) {
        return a + b;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    double add(double x, double y) {
        return x + y;
    }

    void println(){

    }
    void println(boolean x){

    }
    void println(int x) {

    }

    public static void main(String[] args) {
        // Best example of overloading
        System.out.println("Hello Donghan");
        System.out.println(17);
        System.out.println('a');



    }
}
