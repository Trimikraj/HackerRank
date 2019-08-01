package com.algorithm;

public class BirthdayCakeCandle {

    static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        int max = ar[0];    // store first value of array in max
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {      // compare max
                max = ar[i];        // always store highest value in max
                count = 1;         // reset count
            } else if (max == ar[i]) {
                count++;    // if max value repeated then increase count
            }
        }
        return count;       // return count
    }

    // Main function
    public static void main(String[] args) {
        int[] ar = {1, 5, 3, 4, 5};
        int result = birthdayCakeCandles(ar);       // function call with argument and return value
        System.out.println(result);     //Output: 2 (Highest value 5 is repeated 2 times)
    }
}
