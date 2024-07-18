package Recursion;

class Fibonacci {
        static int fib(int n)
        {
            if (n <= 1)
                return n;

            // Recursive call
            return fib(n - 1) + fib(n - 2);
        }

        // Driver Code
        public static void main(String args[])
        {
            int N = 10;

            for (int i = 0; i < N; i++) {

                System.out.print(fib(i) + " ");
            }
        }
}

