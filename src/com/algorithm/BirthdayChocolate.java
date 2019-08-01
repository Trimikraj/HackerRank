package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0, count = 0;
        int len = s.size();
        for (int i = 0; i < len; i++) {
            if ((i + m) <= len) {
                for (int j = i; j < (i + m); j++) {
                    sum += s.get(j);
                }
            }
            if (sum == d) {
                count++;    // if sum match result then count them
            }
            sum = 0;    // reset sum
        }
        return count;   // return number of possible ways to get result
    }

    // Main function
    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>();
        // add values to the List
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(2);
        s.add(1);

        int m = 2; // number of values to sum to get the result
        int d = 3;  // the required result of the sum of numbers

        int result = birthday(s, d, m);     // function call with arguments and return value
        System.out.println(result);     // Output: 4
    }
}
