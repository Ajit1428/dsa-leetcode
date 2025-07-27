package leetcode.arrays;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public int[] getTwoSum(int[] nums, int target){
        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hMap.containsKey(diff)){
                return new int[]{hMap.get(diff), i};
            }
            hMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
