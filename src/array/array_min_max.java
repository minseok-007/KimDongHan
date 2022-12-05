package array;

public class array_min_max {
    public static void main(String[] args) {
        int [] score = {79, 37, 48, 92, 100, 55, 74};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            // minimum works in the same way
        }
    }
}
