package Striver.Array.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Variation3 {
    public List<List<Long>> pascalTriangleBruteForce(int n)
    {
        variation1 v1 =new variation1();
        List<List<Long>> ans = new ArrayList<>();

        for(int row=1; row<=n; row++)
        {
            List<Long> tempList = new ArrayList<>();
            for(int col=1; col<=row; col++)
            {
                tempList.add(v1.nCr(row-1, col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
}
