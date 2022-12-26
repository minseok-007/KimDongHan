package oop;

public class class_instance_method {
    /*
    instance method: 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드
    class method: 인스턴스와 관계없는 (인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드

    - 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
    - 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려
     */
}

class MyMath {
    int a, b;

    int add() { // instance method
        return a + b;
    }
    int subtract() {
        return a - b;
    }

    static int add(int a, int b) { // static method (class method)
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }


}
