package Review;

public class Array_practice2 {
    public static void main(String[] args) {
        /*
        Write code to declare one array to hold 8 Math scores and another one to hold Chemistry scores.
        Store the total of the two scores into a third array called ‘arrayTotal’.
        Display all arrays in a neat tabular format.

         */
        int [] arrayTotal = new int[8];
        int math[] = {10, 20, 30, 40, 50, 60, 70, 80};

        int Chem[] = {10, 20, 30, 40, 50, 60, 70, 80};

        for (int i = 0; i < 8; i++) {
            arrayTotal[i] = math[i] + Chem[i];
            /*
            arrayTotal[0] = math[0]+Chem[0]= 20
            arrayTotal[1] = 40
            arrayTotal[2] = 60
             */
        }

        /*
                math    chem    total
                10      10      20
                20      20      40
         */
    }
}
