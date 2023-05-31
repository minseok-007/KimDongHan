package array;

public class  array_basic {
    public static void main(String[] args) {
        //같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        //Array is a data structure that forms different values of same
        //type into one part
        int [] MathScores = new int[5];
        //[0][1][2][3][4]: the first index of array is 0, not 1
        MathScores[0] = 100;
        MathScores[1] = 50;
        MathScores[2] = 70;
        MathScores[3] = 80;
        MathScores[4] = 30;

        int [] MathScores2 = {100, 50, 70, 80, 30};
        // System.out.println(MhScores2[0]);
        // System.out.println(MathScores2[1]);
        // System.out.println(MathScores2[2]);


        for (int i = 0; i < MathScores2.length; i++) {
            MathScores2[i] = i * 10 + 50;
        }
        //        MathScores2[0] = 50
        //        MathScores2[1] = 60
        //        MathScores2[4] = 90

        for (int i = 0; i < MathScores2.length; i++) {
            System.out.println(MathScores2[i]);
        }

        //배열의 복사 SKIP

        char [] MathGrades = new char[5];

    }
}
