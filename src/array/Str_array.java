package array;

public class Str_array {
    //String Array

    public static void main(String[] args) {
        String name [] = new String[3];
        name[0] = "Minseok";
        name[1] = "Donghan";
        name[2] = "JeongHwan";

//        String schools[] = {"UNIS", "AES", "SIS"};

//        String schools[] = new String[3];
//        schools[0] = "UNIS";
//        schools[1] = "AES";
//        schools[2] = "SIS";
        //String 클래스는 char배열에 기능을 추가한 것
        int a = 10;
        String str = "Java";
        str = str + "8"; //Java8
        System.out.println(str.charAt(2)); //v
        String country = "Korea";
        System.out.println(country.charAt(4)); // a
        System.out.println(country.length()); // 5
        System.out.println(country.substring(1,3));

        System.out.println("Donghan".equals("Donghan")); // Instead of using ==, string should be compared using .equals method

        String c = "Korea";
        String b = "Japan";

        if (c.equals(b)) {
            System.out.println("They are same country");
        }



        /* String 클래스의 주요 메소드
        char charAt(int index): 문자열에서 해당 index 에 있는 문자를 반환
        int length(): 문자의 길이 반환
        String substring(int from, int to): 문자열에서 해당 범위에 있는 문자열을 반환
        boolean equals(String str): 문자열의 내용이 같은지 확인한다. 같으면 true, 다르면 false
        char[] toCharArray(): 문자열을 문자배열로 변환해서 반환
         */

        char [] chArr = {'A', 'B', 'C'}; // ABC
        String word = new String(chArr);
        System.out.println(word);
        char[] temp = word.toCharArray(); // --> {'A', 'B', 'C'}


    }
}
