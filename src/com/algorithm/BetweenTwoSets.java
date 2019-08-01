package com.algorithm;

public class BetweenTwoSets {

    static void getTotalX(int[] a, int[] b) {
        int[][] c = new int[5][20];

        for (int i = 0; i < b.length; i++) {
            for (int j = 1; j <= b[i]; j++) {
                if (b[i] % j == 0) {
                    c[i][j - 1] = j;
                }
            }
        }
        System.out.println(c[0][1]);
//        for (int r = 0; r < c.length; r++) {
//            for (int s = 0; s < c.length; s++) {
//                System.out.println(c[r][s]);
//            }
//            System.out.println("\n");
//        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        getTotalX(a, b);

    }
}
