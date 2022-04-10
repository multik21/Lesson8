package com.homeproject.firstproject;

public class lesson2 {
    public static boolean within10and20(int x1, int x2) {
        if (10 <= x1 + x2 && x1 + x2 <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int j = 0; j < 10; j++) {
            System.out.println("1");
        }
    }
}
