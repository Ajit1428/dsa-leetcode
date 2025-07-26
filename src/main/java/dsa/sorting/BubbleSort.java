package dsa.sorting;

public class BubbleSort {
    // Time complexity is O(n2)
    public int[] sortUsingBubble(int[] nums) {
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }

            }
        }
        return nums;
    }
}
