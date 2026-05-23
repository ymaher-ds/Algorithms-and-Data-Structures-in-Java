package algorithms.sorting;

/**
 * CLRS Chapter 2
 * Insertion Sort
 *
 * Time Complexity:
 * Best: O(n)
 * Average: O(n^2)
 * Worst: O(n^2)
 *
 * Space Complexity: O(1)
 *
 * Stable: Yes
 * In-place: Yes
 */

public class InsertionSort implements Sorter {

    @Override
    public void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}