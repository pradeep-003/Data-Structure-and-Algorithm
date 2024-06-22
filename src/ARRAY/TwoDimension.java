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

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }
    // Traverse 2D array

    public void traverse2DArray() {
        for (int row=0; row < arr.length; row++) {
            for (int col=0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
    }

    // Searching a single value from the Array
    public void searchingValue(int value) {
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at row: "+ row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // Deleting a value from Array
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }

}

//------    Arrays.deepToString(2D_array);
