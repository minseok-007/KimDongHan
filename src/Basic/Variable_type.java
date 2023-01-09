package Basic;

public class Variable_type {
    //boolean (true / false)
    //char (문자를 저장, 변수 당 하나의 문자만 저장)
    //byte, short, int, long 저장할 수 있는 정수의 범위
    //float, double (Real number)
    //final

    final int WIDTH = 10; // final 붙은 variable은 initialize 안해주면 에러 뜸.
    public static void main(String[] args) {
        boolean isMale = true;
        System.out.println(isMale);


        int donghan_age = 16;
        System.out.println(donghan_age+1);

        char c = 'a';
        System.out.println(c);

        //문자열 (원래 클래스이므로 객체를 생성하는 연산자 new를 사용해야 하지만, 그러지 않아도 됨)

        String name = new String("Java");
        String name2 = "Java17";

        //출력
        System.out.printf("age:%d, year:%d", 14, 2014); // %d자리에 숫자가 차례대로 들어감
        System.out.println("age: " + 14 + "year: " + 2014);

        /*
        %d: 10진수 정수
        %b: boolean
        %f: 10진수 실수

         */


    }

}
