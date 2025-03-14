package Striver.Array.sort012;

import java.util.ArrayList;
import java.util.Arrays;

public class BetterApproach {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for(int i=0; i<n; i++) {
            if(arr.get(i) == 0)  cnt0++;
            else if(arr.get(i) == 1)  cnt1++;
            if(arr.get(i) == 2)  cnt2++;
        }

        for(int i=0; i<cnt0; i++) arr.set(i, 0);
        for(int i=cnt0; i<cnt0+cnt1; i++) arr.set(i, 1);
        for(int i=cnt0+cnt1; i<n; i++) arr.set(i, 2);

    }
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
