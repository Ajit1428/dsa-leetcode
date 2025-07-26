package dsa.sorting;

public class QuickSort {
    //Time complexity O(nlogn)
    public static int getPivotPoint(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low - 1;

        for(int j=low; j < high; j++){
            if(i <= 0 && nums[j] < pivot){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }

    public static void divideAndConquer(int[] nums, int low, int high){
        if(low < high){
            int pivot = getPivotPoint(nums, low, high);
            divideAndConquer(nums, low, pivot - 1);
            divideAndConquer(nums, pivot + 1, high);
        }

    }

    public int[] sortUsingQuick(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        divideAndConquer(nums, low, high);

        return nums;
    }

}
