package Striver.Array.PascalTriangle;

public class Variation2
{

    void pascalRowBruteForce(int n)
    {
        variation1 v1 = new variation1();
        long ans = 1;
        System.out.print(ans + " ");  // printing 1st element
        // Printing the rest of the part:
        for(int i=1; i<n; i++)
        {
            System.out.print( v1.nCr(n-1, i) + " ");
        }
        System.out.println();
        // T.c -- O(n*r)
    }

    void pascalRow(int n)
    {
        long ans = 1;
        System.out.print(ans + " ");  // printing 1st element

        // Printing the rest of the part:
        for(int i=1; i<n; i++)
        {
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
