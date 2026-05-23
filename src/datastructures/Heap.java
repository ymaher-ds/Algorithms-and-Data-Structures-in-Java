package datastructures;

public class Heap {

    public static void buildMaxHeap(int[] A) {
        // Start at the last non-leaf node and work backward to index 0
        for (int i = (A.length / 2) - 1; i >= 0; i--) {
            maxHeapify(A, i);
        }
    }

    public static void maxHeapify(int[] A, int i) {
        int l = Left(i);
        int r = Right(i);

        int largest = i;
        // Check if left child exists and is larger than current largest
        if (l < A.length && A[l] > A[largest]) {
            largest = l;
        }
        // Check if right child exists and is larger than current largest
        if (r < A.length && A[r] > A[largest]) {
            largest = r;
        }

        // If largest is not the root, swap and recurse
        if (largest != i) {
            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;

            maxHeapify(A, largest);
        }
    }

    // 0-based parent index calculation
    public static int Parent(int i) {
        return (i - 1) / 2;
    }

    // 0-based left child index calculation
    public static int Left(int i) {
        return 2 * i + 1;
    }

    // 0-based right child index calculation
    public static int Right(int i) {
        return 2 * i + 2;
    }

    public static void main(String[] args) {
        int[] A = { 16, 4, 10, 14, 7, 9, 3, 2, 8, 1 };
        buildMaxHeap(A);

        // Print the max-heapified array
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
