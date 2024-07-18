package Sorting;

public class InsertionSort {
    static void insertionSort(int a[]) {
        for (int i = 1; i < a.length - 1; i++) {
            int j = i, temp = a[i];
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i<n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int []arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
            insertionSort(arr);
            printArray(arr);
        }
}
