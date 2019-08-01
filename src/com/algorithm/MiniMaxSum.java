package com.algorithm;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long min = 0, max = 0, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // always skip one value linearly
                if (i != j) {
                    sum += arr[j];      // finds sum of all values except one
                }
            }
            if (i == 0) {
                min = sum;      // assuming first sum value is the minimum value
            }
            // comparing sum to find minimum and maximum values
            if (sum > max) {
                max = sum;
            } else if (sum < min) {
                min = sum;
            }
            sum = 0; // reset sum value
        }
        // print minimum and maximum sum value from the array
        System.out.println(min + " " + max);    // Output: 45  54
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // function call with array as an argument
        miniMaxSum(arr);
    }
}
