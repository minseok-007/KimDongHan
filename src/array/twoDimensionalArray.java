package array;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int [] score = {100, 90,80, 50, 70}; //

        int [] array = new int[3];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = 10;
        }
        int [][] arr = new int[3][4];
        
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 20;
            }
        }

        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int [][] score2 = {
                {50,40},
                {30,20},
                {70,80}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(score2[i][j] + " ");
            }
            System.out.println();
        }

        // Find the minimum value of score2

        /*
        80 90 40 45
        30 40 20 10
        58 38 56 74 
         */
    }
}
