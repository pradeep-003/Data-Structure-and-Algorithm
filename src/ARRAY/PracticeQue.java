package ARRAY;

import java.util.Arrays;

public class PracticeQue {


        public static int[] twoSum(int[] nums, int target) {
            int[] output = new int[2];
            outerloop:
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j] == target && nums[i]!=nums[j]){
                        output[0] = nums[i];
                        output[1] = nums[j];
                        break outerloop;
                    }
                }
            } return output;
        }

    public static void main(String[] args) {
        int[] output = twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(output));
    }


}




