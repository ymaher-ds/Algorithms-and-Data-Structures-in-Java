package algorithms.sorting;

/**
 * CLRS Chapter 2
 * Merge Sort
 *
 * Time Complexity:
 * Best: O(n log n)
 * Average: O(n log n)
 * Worst: O(n log n)
 *
 * Space Complexity: O(n)
 *
 * Stable: Yes
 * In-place: No
 */

public class MergeSort implements Sorter {

    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int p, int r) {

        if (p < r) {

            int q = p + (r - p) / 2;

            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);

            merge(arr, p, q, r);
        }
    }

    private void merge(int[] arr, int p, int q, int r) {

        int nL = q - p + 1;
        int nR = r - q;

        int[] L = new int[nL];
        int[] R = new int[nR];

        System.arraycopy(arr, p, L, 0, nL);
        System.arraycopy(arr, q + 1, R, 0, nR);

        int i = 0;
        int j = 0;
        int k = p;

        while (i < nL && j < nR) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < nL) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < nR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}