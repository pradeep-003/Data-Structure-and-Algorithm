package ARRAY;

import java.util.Scanner;

public class Temperature_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = sc.nextInt();
        int temp[] = new int[numDays];
        int sum = 0;
        for(int i=1; i<=numDays; i++){
            System.out.print("Day "+ i +"'s high temp: ");
            temp[i-1] = sc.nextInt();
            sum += temp[i-1];
        }

        double avg = sum / numDays;
        int count = 0;
        for(int i=0; i< temp.length; i++){
            if(temp[i]>avg){
                count++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + avg);
        System.out.println(count + " days above average");
    }

}
