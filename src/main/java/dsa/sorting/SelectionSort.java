package dsa.sorting;

public class SelectionSort {
    //Time complexity O(n2)
    public int[] sortUsingSelection(int[] nums) {
        for(int i=0; i < nums.length - 1; i++){
            int minIdx = i;
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }

            int temp = nums[minIdx];
            nums[minIdx] =  nums[i];
            nums[i] = temp;
        }

        return nums;
    }

}
