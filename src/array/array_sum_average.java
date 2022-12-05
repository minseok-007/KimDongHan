package array;

public class array_sum_average {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;

        int [] score = {100, 86, 48, 75, 89};


        for (int i = 0; i < score.length; i++) {
            sum += score[i]; // sum += score[0]
            // sum+= score[1]
        }

        System.out.println(sum);

        average = (double)sum / 5; //type casting


        System.out.println(average);







    }
}

