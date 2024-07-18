package Striver.Array.PascalTriangle;
import java.util.*;
// Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

public class variation1 {
    public long nCr(int n, int r)
    {
        long res = 1;
        for(int i=0; i<r; i++)
        {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }

}

//    Time Complexity: O(c), where c = given column number.
//        Reason: We are running a loop for r times, where r is c-1.
//
//        Space Complexity: O(1) as we are not using any extra space.