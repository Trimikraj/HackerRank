package com.algorithm;

public class Staircase {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // prints empty spaces at the begining
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");  // prints 1 '#', then 2, then 3 and so on...
            }
            System.out.println(""); // print in next line
        }
    }

    // Main function
    public static void main(String[] args) {
        int n = 8;
        // function call with integer argument
        staircase(n);
    }
}
