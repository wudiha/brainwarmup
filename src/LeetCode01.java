
/*
* https://leetcode.com/problems/two-sum/
* Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSums(new int[]{2,7,11,15},9)));
    }

    public static int[] twoSums(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
