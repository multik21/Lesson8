package com.homeproject.firstproject;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        retLenArr();
    }

        public static void invertArray() {
            int[] arr = {1, 0, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
                System.out.print(arr[i] + " ");

            }
        }
        public static void fillArray() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }
        }
        public static void changeArray() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
                System.out.print(arr[i] + " ");
            }
        }
        public static void fillDiagonal() {
            int[][] arr = new int[4][4];
            for (int i = 0; i < 4; i++) {
                    arr[i][i] = 1;
                    arr[i][4 - i - 1] = 1;
            }
        }
        public static int[] retLenArr (int len, int initialValue){
            int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
            return arr;
    }
    }






