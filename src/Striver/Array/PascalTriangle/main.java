package Striver.Array.PascalTriangle;

import java.util.List;

public class main
{
    public static void main(String[] args)
    {
        variation1 v1 = new variation1();
        System.out.println(v1.nCr(4, 2)); // in pascal Triangle it's row 5 column 3
        Variation2 v2 = new Variation2();
        v2.pascalRowBruteForce(6); // printing 6th row
        v2.pascalRow(6);
        Variation3 v3 = new Variation3();
        List<List<Long>> ans = v3.pascalTriangleBruteForce(6);
        System.out.println(ans);
    }
}
