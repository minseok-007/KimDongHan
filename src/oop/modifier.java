package oop;

public class modifier {
    // 접근 제어자 - public, protected, default, private
    // 그 외 - static, final, abstract, native, transient, synchronized volatile, strictfp

    // static: '클래스의' 또는 '공통적인'. static variable은 instance에 관계없이 같은 값을 가짐.
    // static이 붙은 variable, metho는 인스턴스를 생성하지 않고도 사용 가능

    //final: 변수에 사용되면 변경할 수 없는 constant가 되고, 메서드에 사용되면 오버라이딩을 할 수 없고, 클래스에 사용되면 child class를 만들 수 없음.

}

class StaticTest {
    static int width = 200;
    static int height = 120;
    static int max(int a, int b) {
        return a > b ? a : b;
    }
}

final class FinalTest { // parent class가 될 수 없음.
    final int MAX_SIZE = 10; // 값을 변경 불가

    final int getMaxSize() { // 오버라이딩 불가
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}
