package ARRAY;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        linearSearch(intArray, 6);

    }
    // Search Method
    public static void linearSearch(int[] intArray, int value) {
        for(int i=0; i<intArray.length; i++) {
            if (intArray[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }
}



