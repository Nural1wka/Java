package com.example.mycalculator;

import java.util.Arrays;

public class ArrayEqualityTest {
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {

        if (arr1 == null && arr2 == null) {
            return true;
        }


        if (arr1 == null || arr2 == null) {
            return false;
        }


        if (arr1.length != arr2.length) {
            return false;
        }


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = { 51, 44, 35, 27, 312 };
        int[] arr4 = { 11, 23, 3321, 32};

        System.out.println("Are arr1 and arr2 equal? " + areArraysEqual(arr1, arr2));
        System.out.println("Are arr1 and arr3 equal? " + areArraysEqual(arr1, arr3));
        System.out.println("Are arr1 and arr4 equal? " + areArraysEqual(arr1, arr4));
    }
}
