/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm;

import java.util.Scanner;

/**
 *
 * @author Trimik Raj Maharjan
 */
public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String res = "";
        int len = s.length();
        if ((s.charAt(len - 2)) == 'a' || (s.charAt(len - 2)) == 'A') {
            String temp = Character.toString(s.charAt(0));
            temp += s.charAt(1);
            if ((Integer.parseInt(temp)) > 12) {
                System.out.println("Enter Time in 12-hour format!");
            } else {

                if ((s.charAt(0) == '1') && (s.charAt(1) == '2')) {
                    res = "00";
                    for (int i = 2; i < len - 2; i++) {
                        res += s.charAt(i);
                    }
                } else {
                    for (int i = 0; i < len - 2; i++) {
                        res += s.charAt(i);
                    }
                }
            }
        } else if ((s.charAt(len - 2)) == 'p' || (s.charAt(len - 2)) == 'P') {
            String temp1 = Character.toString(s.charAt(0));
            temp1 += s.charAt(1);
            if ((Integer.parseInt(temp1)) > 12) {
                System.out.println("Enter Time in 12-hour format!");
            } else {
                if ((s.charAt(0) == '1') && (s.charAt(1) == '2')) {
                    res = "12";
                    for (int i = 2; i < len - 2; i++) {
                        res += s.charAt(i);
                    }
                } else {
                    String temp2 = Character.toString(s.charAt(0));
                    temp2 += s.charAt(1);
                    int temp3 = 12 + Integer.parseInt(temp2);
                    res = Integer.toString(temp3);
                    for (int i = 2; i < len - 2; i++) {
                        res += s.charAt(i);
                    }
                }
            }
        }

        return res;

    }

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
