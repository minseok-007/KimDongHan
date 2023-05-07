package Review;

public class Array_practice2 {
    public static void main(String[] args) {
        /*
        Write code to declare one array to hold 8 Math scores and another one to hold Chemistry scores.
        Store the total of the two scores into a third array called ‘arrayTotal’.
        Display all arrays in a neat tabular format.

         */
        int [] arrayTotal = new int[8];
        char [] grade = new char [8];
        int count = 0;
        int math[] = {40, 20, 30, 40, 50, 46, 37, 25};

        int Chem[] = {38, 47, 21, 43, 49, 36, 47, 39};



        System.out.println("math" + " " + "chem" + " " + "total"+ " " + "grade");
        for (int i = 0; i < 8; i++) {
            arrayTotal[i] = math[i] + Chem[i];


            if (arrayTotal[i] >= 90) {
                grade[i] = 'A';
                count++;
            }
            else if (arrayTotal[i] >= 80) {
                grade[i] = 'B';

            }
            else if (arrayTotal[i] >= 70) {
                grade[i] = 'C';
            }
            else if (arrayTotal[i] >= 60) {
                grade[i] = 'D';
            }
            else {
                grade[i] = 'F';
            }

            System.out.println(math[i] + "   " + Chem[i] + "   "  + arrayTotal[i] + "    " + grade[i]);

            /*
            arrayTotal[0] = math[0]+Chem[0]= 20
            arrayTotal[1] = 40
            arrayTotal[2] = 60
             */
        }

        /*
                math    chem    total   grade
                10      10      20      F
                20      20      40      F
         */
    }
}
