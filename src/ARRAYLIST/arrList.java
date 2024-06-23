package ARRAYLIST;

import java.util.ArrayList;

public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3,4);
        numbers.add(4,5);
        System.out.println(numbers.get(3));
        for (int i=0;i<numbers.size(); i++){
            System.out.print(numbers.get(i)+" ");
        }
    }
}
