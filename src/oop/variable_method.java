package oop;

public class variable_method {
    /*
    variable has three types: class variable, instance variable, local variable
    The type is determined by the location of which the variable is declared
     */
}

class Variable {
    int iv; // instance variable: 클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어진다. 그렇기 때문에 인스턴스 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스를 생성해야 한다.
    static int cv; // class variable: 인스턴스마다 독립적인 저장공간을 갖는 인스턴스변수와는 달리, 클래스변수는 모든 인스턴스가 공통된 저장공간을 공유하게 된다. 인스턴스를 생성하지 않고도 언제라도 바로 사용 가능.

    void method() {
        int lv = 0; // local variable: 메서드 내에 선언되어 메서드 내에서만 사용 가능하며, 메서드가 종료되면 소멸되어 사용할 수 없게 된다. for문 또는 while문의 블럭 내에 선언된 지역변수는, 지역변수가 선언된 블럭
        //내에서만 사용 가능하며, 블럭을 벗어나면 소멸되어 사용할 수 없게 된다.
    }
}


class Card {
    String kind;
    int number;

    static int width = 100; // class variable
    static int height = 250;

    void method() {
        int a = 10;
        System.out.println("Hello");
    }
}

class CardTest{
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        System.out.println(c1.number);
        System.out.println(c1.kind);
    }

}
