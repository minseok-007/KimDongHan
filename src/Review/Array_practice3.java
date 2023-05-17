package Review;
// 보류
public class Array_practice3 {
    public static void main(String[] args) {
        //Given two sorted arrays, find the median of the values of two arrays.

        int arr1[] = {1,3,5,7, 8, 10, 12};
        int arr2[] = {2,2,3,6, 14,16, 20};

        //1 2 3
        //4 5 6

        int arr3[] = new int [arr1.length + arr2.length];
        // {1,1,2,3,5,6,7,8,
        int count = 0;
        int arr1Index = 0;
        int arr2Index = 0;
        while (count < arr1.length + arr2.length) {
            if (arr1[arr1Index] >= arr2[arr2Index]) { // arr1[arr1Index]:  /    arr2[arr2Index]:
                arr3[count] = arr2[arr2Index];

            } else {
                arr3[count] = arr1[arr1Index];
            }
            count++;
        }
    }
}
