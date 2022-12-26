package Basic;

public class Variable {
    public static void main(String[] args) {

        int age;
        age = 16;

        int a;
        int b;  //is equivalent to int a,b;

        int x = 0;
        int y = 0; //is equivalent to int x = 0, y = 0;

        System.out.println(age); //print vs println(print line --> 한 줄 띄워서 print)

        age = age + 1;

        System.out.println(age);

        int c = 10;
        int d = 20;

        int tmp = 0;

        tmp = c; // tmp = 10
        c = d; // c = 20 d = 20
        d = tmp; // d = 10


        // Variable naming principle
        /*
        1. 대소문자 구분 (age랑 Age는 다른 variable), 길이 제한 X
        2. 예약어 사용 X (true, public, static...)
        3. 숫자로 시작 X
        4. 특수문자는 _와 $만 허용 (^*&#@는 안되겠죠?)
         */

        /*
        권장하는 내용
        1. 클래스 이름의 첫 글자는 항상 대문자로
        2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 (lastIndexOf)
         */
    }
}
