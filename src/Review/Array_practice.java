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

        int arr[] = {2,6,7,5,6,19,44,231,21};
int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
              count++;


    }
}
