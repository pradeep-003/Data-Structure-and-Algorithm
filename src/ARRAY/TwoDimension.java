package ARRAY;

import java.util.Arrays;

public class TwoDimension {
    int arr[][];

       public TwoDimension(int noOfRows, int noOfColumns){
        arr = new int[noOfRows][noOfColumns];
        for(int row=0; row< noOfRows; row++){ //arr.length
            for(int column=0; column< noOfColumns; column++) //arr[0].length
            arr[row][column] = Integer.MIN_VALUE;
        }
    }

    // Inserting values in ARRAY
    public void insert(int row, int col, int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }
}

//------    Arrays.deepToString(2D_array);
