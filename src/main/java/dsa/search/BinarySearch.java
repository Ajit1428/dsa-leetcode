package dsa.search;

public class BinarySearch {
    // Time complexity O(logn)
    public int findTargetValueUsingBinarySearch(int[] nums, int target){
        int startPosition = 0;
        int endPosition = nums.length - 1;

        while(startPosition <= endPosition){
            int midPosition = (startPosition + endPosition) / 2;
            if(nums[midPosition] == target){
                return midPosition;
            }else if(nums[midPosition] < target){
                startPosition = midPosition + 1;
            }else{
                endPosition = midPosition - 1;
            }
        }

        return -1;
    }

    // Time complexity 0(logn)
    public int findTargetValueUsingBinaryRecursion(int[] nums, int target, int startPosition, int endPosition){
        if(startPosition <= endPosition){
            int midPosition = (startPosition + endPosition) / 2;

            if(nums[midPosition] == target){
                return midPosition;
            }else if(nums[midPosition] < target){
                return findTargetValueUsingBinaryRecursion(nums, target, midPosition + 1, endPosition);
            }else{
                return findTargetValueUsingBinaryRecursion(nums, target, startPosition, midPosition - 1);
            }
        }

        return -1;
    }
}
