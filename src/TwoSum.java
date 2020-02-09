import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] testSet = new int[]{2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(testSet, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int searchKey = target - nums[j];
            if (numMap.containsKey(searchKey)) {
                return new int[]{j, numMap.get(searchKey)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}