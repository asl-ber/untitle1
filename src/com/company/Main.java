package com.company;

import java.util.Arrays;

public class Main {


    public static void quickSort(int[] array, int low, int high) {


        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, d = high;
        while (i <= d) {
            while (array[i] < opora) {
                i++;
            }

            while (array[d] > opora) {
                d--;
            }

            if (i <= d) {
                int temp = array[i];
                array[i] = array[d];
                array[d] = temp;
                i++;
                d--;
            }
        }

        if (low < d)
            quickSort(array, low, d);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int[] s = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(s));

        int low = 0;
        int high = s.length - 1;

        quickSort(s, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(s));
    }


    public static void quickSort(long[] array, long low, long high) {

        if (array.length == 0)
            return;

        if (low >= high)
            return;

        long middle = low + (high - low) / 2;
        long opora = array[(int)middle];

        long i = low, j = high;
        while (i <= j) {
            while (array[(int)i] < opora) {
                i++;
            }

            while (array[(int)j] > opora) {
                j--;
            }

            if (i <= j) {
                long temp = array[(int)i];
                array[(int)i] = array[(int)j];
                array[(int)j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void zz(String[] args, long z) {
        long[] s = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(s));

        long low = 0;
        long high = s.length - 1;

        quickSort(s, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(s));
    }
}