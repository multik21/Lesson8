package com.homeproject.firstproject;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkHomework();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkHomework() {
        int a = 10;
        int b = 20;
        int c = a+b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value = 6;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value>=1 && value <=100) {
            System.out.println("Желтый");
        }
        if (value >= 101) {
            System.out.println("Зеленый");
        }
   }
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
