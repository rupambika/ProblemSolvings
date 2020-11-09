package com.arrays;
// Given an array and Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
// int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12} , n = 12 and d = 3
// after rotating the array with d elements the array will become
// int arr [] = {4,5,6,7,8,9,10,11,12,1,2,3};

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = arr.length, d = 3;

        int a[] = rotate(arr, n, d);

        Arrays.stream(a).forEach(i -> {
            System.out.println("print: " + i);
            System.out.print("\t");
        });

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int[] rotate(int arr[], int n, int d) {
        int g_c_d = gcd(n, d);
        for (int i = 0; i < g_c_d; i++) {
            int temp = arr[i];
            int j = i;
            int k = 0;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
