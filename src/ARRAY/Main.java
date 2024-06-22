package ARRAY;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

                    /*
---- Single Dimension
        SingleDimension array = new SingleDimension(5);



// Inserting values in ARRAY
            array.insert(0,15);
            array.insert(1,16);
            array.insert(0,17);
            array.insert(12,18);
            array.insert(5,18);
            array.insert(4,19);

//Accessing the element of ARRAY
            try{
                int firstElement = array.arr[0];
                System.out.println(firstElement);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.toString());
            }
            try{
                int sixthElement = array.arr[5];
                System.out.println(sixthElement);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.toString());
            }


//traversing the array
            array.traverseArray();


//Finding the element in array
            array.searchInArray(19);
            array.searchInArray(25);

// Delete value from Array
        array.deleteValue(0);
        array.deleteValue(5);

*/

        TwoDimension arr = new TwoDimension(2,3);
        arr.insert(0,0,10);
        arr.insert(0,1,11);
        arr.insert(0,3,112);
        arr.insert(0,0,100);
        arr.insert(1,2,12);
        System.out.println(Arrays.deepToString(arr.arr));

        arr.accessCell(0,0);
        arr.accessCell(1,1);

        arr.traverse2DArray();

        arr.searchingValue(12);
        arr.searchingValue(100);

        arr.deleteValueFromArray(0,0);
        System.out.println(Arrays.deepToString(arr.arr));
    }


}
