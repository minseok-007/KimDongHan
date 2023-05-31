package Review;

public class Array_practice4 {

    public static void main(String[] args) {
        // array of type int that stores 5 different heights
        double height [] = {140, 150, 160, 170, 180};

        // array of type double that stores 5 different weights

        double weight [] = {40, 50, 80, 50, 110};

        // array of type double that stores bmi, using the value of array height and weight
        // bmi is calculated as weight/(height*height)

        double [] bmi = new double[5];

        for (int i = 0; i < 5; i++){
            bmi [i] =  weight[i] /  (height[i]/100 *height [i]/100);

            System.out.println(bmi[i]);
        }

        // bmi 18.5 이하면 저체중, 18.5 - 22.9 사이면 정상, 23.0 - 24.9 사이면 과체중, 25이상부터는 비만
        // Find the number of 저체중, 정상, 과체중, and 비만
        int underweightCount = 0;
        int averageCount = 0;
        int overweightCount = 0;
        int obeseCount = 0;


        for (int i = 0; i < 5; i++) {
            double bmivalue = bmi[i];
            if (bmivalue < 18.5) {
                underweightCount++;
            } else if (bmivalue >= 18.5 && bmivalue <= 22.9) {
                averageCount++;
            } else if (bmivalue >= 23.0 && bmivalue <= 24.9) {
                overweightCount++;
            } else {
                obeseCount++;
            }
        }
        System.out.println("Number of underweight people: " + underweightCount);
        System.out.println("Number of average people: " + averageCount);
        System.out.println("Number of overweight people: " + overweightCount);
        System.out.println("Number of obese people: " + obeseCount);
}
