package app;

import algorithms.sorting.InsertionSort;
import algorithms.sorting.MergeSort;
import algorithms.sorting.Sorter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = { 4, 2, 7, 1, 6, 3, 0 };
        int[] arr2 = { 4, 2, 7, 1, 6, 3, 0 };

        Sorter insertion = new InsertionSort();
        Sorter merge = new MergeSort();

        insertion.sort(arr1);
        merge.sort(arr2);

        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr1));

        System.out.println();

        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(arr2));
    }
}