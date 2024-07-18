package ARRAY;

import java.util.Arrays;

class GFG1 {
    static int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort( arr ) ;

        int ans = arr[n-1]-arr[0] ;

        int smallest = arr[0]+k ;
        int largest = arr[n-1]-k ;

        int mi = 0 , ma = 0 ;

        for( int i = 0 ; i < n-1 ; i++ ){
            mi = Math.min( smallest , arr[i+1]-k ) ;
            ma = Math.max( largest , arr[i]+k ) ;

            if( mi < 0 )continue ;

            ans = Math.min( ans , ma-mi ) ;

        }
        return ans ;


    }

    public static void main(String[] args) {
        int val = getMinDiff(new int[]{1, 3, 5, 8},4, 4);
        System.out.println(val);
    }
}