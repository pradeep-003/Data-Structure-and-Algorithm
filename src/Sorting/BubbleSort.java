package Sorting;
public class BubbleSort {

  static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j =0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
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
    bubbleSort(arr);
    printArray(arr);
  }
}
