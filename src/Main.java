/*
 * 
 * To use the code in LeetCode please run this:
 * 
 * class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexOfRelevantNumbers = {0,0};
        for(int i = 0; i < nums.length -1 ; i++ ){
            for (int j = i +1; j < nums.length; j++ ){
                if (nums[i] + nums[j] == target){
                    // The index of these numbers should be stored
                    indexOfRelevantNumbers[0] = i;
                    indexOfRelevantNumbers[1] = j;
                }

            }
        }
        return indexOfRelevantNumbers;
    }
}
 */


import java.util.Arrays;

public class Main {
    public static int[] twoSums(double[] arrayOfInts, int target ) {
        int[] indexOfRelevantNumbers = {0,0};
        for(int i = 0; i < arrayOfInts.length -1 ; i++ ){
            for (int j = i +1; j < arrayOfInts.length; j++ ){
                if (arrayOfInts[i] + arrayOfInts[j] == target){
                    System.out.println(arrayOfInts[i] + "\n" + arrayOfInts[j]);
                    // The index of these numbers should be stored
                    indexOfRelevantNumbers[0] = i;
                    indexOfRelevantNumbers[1] = j;

                }

            }
        }
        return indexOfRelevantNumbers;
    }

    public static void main(String[] args) throws Exception { 
        double[] arrayOfInts = {3,2,4};
        int target = 9;
        System.out.println(Arrays.toString(twoSums(arrayOfInts, target)));

    }
}
