package Striver.Array.MatrixRotation;

public class BruteForce {
    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int [][]rotated = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                rotated[i][j] = matrix[(n-1)-j][i];
            }
        }
        return rotated;
    }

    static int[][] tempRotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n/2; i++) {
            for(int j=0; j<n/2; j++) {
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][(n-1)-i];
                matrix[j][(n-1)-i] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rotated[][] = tempRotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }
}
