package dsa.search;

public class LinearSearch {
    //Time complexity O(n)
    public int findTargetValueUsingLinearSearch(int[] nums, int target){
          for(int i=0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}
