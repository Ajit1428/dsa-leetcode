package dsa.sorting;

public class MergeSort {
    //Time complexity O(nlogn)
    public static void mergeArr(int[] nums, int l, int r, int mid){
        int sizeLeftArr = (mid - l) + 1;
        int sizeRightArr = r - mid;

        int[] leftArr = new int[sizeLeftArr];
        int[] rightArr = new int[sizeRightArr];

        // Copying the values to the created array
        for(int x=0; x < sizeLeftArr; x++){
            leftArr[x] = nums[l+x];
        }

        for(int y=0; y < sizeRightArr; y++){
            rightArr[y] = nums[mid + 1 + y];
        }


        // Comparison and merging of arrays
        int i = 0;
        int j = 0;
        int k = l; // Start with the leftmost part of the actual array

        while(i < sizeLeftArr && j < sizeRightArr){
            if(leftArr[i] <= rightArr[j]){
                nums[k] = leftArr[i];
                i++;
            }else{
                nums[k] = rightArr[j];
                j++;
            }

            k++;
        }

        // This ensures to copy the untouched or leftover elements
        while (i< sizeLeftArr){
            nums[k++] = leftArr[i++];
        }

        while(j < sizeRightArr){
            nums[k++] = rightArr[j++];
        }

    }

    public static void divideArr(int[] nums, int l, int r){
        if(l < r){
            int mid = (l + r) / 2;
            divideArr(nums, l, mid);
            divideArr(nums, mid + 1, r);
            mergeArr(nums, l , r, mid);
        }
    }

   public int[] sortUsingMerge(int[] nums){
        divideArr(nums, 0, nums.length - 1);
        return nums;
   }

}
