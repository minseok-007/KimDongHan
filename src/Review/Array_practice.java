package Review;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {
        // Write a Java program to test if an array contains a specific value.

        /*
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt(); // 10

        int arr[] = {1,5, 3, 9, 7};

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " exists in the array");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println(num + " does not exist");
        }
         */

        // Write a Java program to test the equality of two arrays.

        /*
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {6,7,8,9,10,11};


        boolean flag = true;


        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("arr1 and arr2 are equal.");
        }

         */

        // Write a Java program to find the number of even and odd integers in a given array of integers

        /*
        int arr[] = {2, 6, 7, 5, 6, 19, 44, 231, 21};
        int count_odd = 0;
        int count_even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {


                count_even++;
            }
            if (arr[i] % 2 == 1) {


                count_odd++;
            }
        }
        System.out.println(count_even);
        System.out.println(count_odd);
        */


        //Write a java program that prints out the maximum sum of two elements from the array

        /*
        int arr[] = {1,4,5,3,8,9,7};

        int max = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] > max) {
                    max = arr[i] + arr[j];
                }
            }
        }

        System.out.println(max);


         */

        // Write a Java program to get the difference
        // between the largest and smallest values in an array of integers.

        int arr[] = {1, 4, 5, 3, 8, 9, 7};

        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] > min) {
                    min = arr[i] - arr[j];


                }
            }
        }
    }
}
